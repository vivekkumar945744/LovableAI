package com.vivekkumar.projects.lovable_clone.dto.subscription;

public record PlanLimitsResponse(
        String planName,
        int maxTokensPerDay,
        int maxProjects,
        boolean unlimitedAt
) {
}
