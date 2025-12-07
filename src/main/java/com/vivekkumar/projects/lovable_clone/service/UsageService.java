package com.vivekkumar.projects.lovable_clone.service;

import com.vivekkumar.projects.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.vivekkumar.projects.lovable_clone.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
    public @Nullable UsageTodayResponse getTodayUsage(Long userId);

    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
