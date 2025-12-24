package com.vivekkumar.projects.lovable_clone.service.impl;

import com.vivekkumar.projects.lovable_clone.dto.member.InviteMemberRequest;
import com.vivekkumar.projects.lovable_clone.dto.member.MemberResponse;
import com.vivekkumar.projects.lovable_clone.dto.member.UpdateMemberRoleRequest;
import com.vivekkumar.projects.lovable_clone.entity.Project;
import com.vivekkumar.projects.lovable_clone.entity.ProjectMember;
import com.vivekkumar.projects.lovable_clone.entity.ProjectMemberId;
import com.vivekkumar.projects.lovable_clone.entity.User;
import com.vivekkumar.projects.lovable_clone.mapper.ProjectMemberMapper;
import com.vivekkumar.projects.lovable_clone.repository.ProjectMemberRepository;
import com.vivekkumar.projects.lovable_clone.repository.ProjectRepository;
import com.vivekkumar.projects.lovable_clone.repository.UserRepository;
import com.vivekkumar.projects.lovable_clone.service.ProjectMemberService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Transactional
public class ProjectMemberServiceImpl implements ProjectMemberService {

    ProjectMemberRepository projectMemberRepository;
    ProjectRepository projectRepository;
    ProjectMemberMapper memberResponseMapper;
    UserRepository userRepository;

    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        Project project = getAccessibleProjectById(projectId, userId);
        return projectMemberRepository.findByIdProjectId(projectId)
                .stream()
                .map(memberResponseMapper::toMemberResponseFromProjectMember)
                .toList();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        Project project = getAccessibleProjectById(projectId, userId);

        User invitee = userRepository.findByUsername(request.username()).orElseThrow();
        if (invitee.getId().equals(userId)) {
            throw new RuntimeException("Can not invite yourself");
        }
        ProjectMemberId projectMemberId = new ProjectMemberId(projectId, invitee.getId());

        if (projectMemberRepository.existsById(projectMemberId)) {
            throw new RuntimeException("Cannot invite once again");
        }
        ProjectMember projectMember = ProjectMember.builder()
                .id(projectMemberId)
                .project(project)
                .user(invitee)
                .projectRole(request.role())
                .invitedAt(Instant.now())
                .build();
        projectMemberRepository.save(projectMember);

        return memberResponseMapper.toMemberResponseFromProjectMember(projectMember);
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId) {
        Project project = getAccessibleProjectById(projectId, userId);

        ProjectMemberId projectMemberId = new ProjectMemberId(projectId, memberId);
        ProjectMember projectMember = projectMemberRepository.findById(projectMemberId).orElseThrow(() -> new RuntimeException("not found"));

        projectMember.setProjectRole(request.role());
        projectMemberRepository.save(projectMember);
        return memberResponseMapper.toMemberResponseFromProjectMember(projectMember);
    }

    @Override
    public Void removeProjectMember(Long projectId, Long memberId, Long userId) {
        Project project = getAccessibleProjectById(projectId, userId);

        ProjectMemberId projectMemberId = new ProjectMemberId(projectId, memberId);
        if (!projectMemberRepository.existsById(projectMemberId)) {
            throw new RuntimeException("Member not found in project");
        }
        projectMemberRepository.deleteById(projectMemberId);
        return null;
    }

    public Project getAccessibleProjectById(Long projectId, Long userId) {
        return projectRepository.findAccessibleProjectById(projectId, userId).orElseThrow();
    }
}
