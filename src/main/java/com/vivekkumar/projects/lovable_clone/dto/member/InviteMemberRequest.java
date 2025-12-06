package com.vivekkumar.projects.lovable_clone.dto.member;

import com.vivekkumar.projects.lovable_clone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
