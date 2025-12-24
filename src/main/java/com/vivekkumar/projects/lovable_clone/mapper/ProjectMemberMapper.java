package com.vivekkumar.projects.lovable_clone.mapper;

import com.vivekkumar.projects.lovable_clone.dto.member.MemberResponse;
import com.vivekkumar.projects.lovable_clone.entity.ProjectMember;
import com.vivekkumar.projects.lovable_clone.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProjectMemberMapper {

    @Mapping(target = "userId", source = "id")
    @Mapping(target = "projectRole", constant = "OWNER")
    MemberResponse toMemberResponse(User user);

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "username", source = "user.username")
    @Mapping(target = "name", source = "user.name")
    MemberResponse toMemberResponseFromProjectMember(ProjectMember projectMember);
}
