package com.vivekkumar.projects.lovable_clone.service.impl;

import com.vivekkumar.projects.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.vivekkumar.projects.lovable_clone.dto.subscription.UsageTodayResponse;
import com.vivekkumar.projects.lovable_clone.service.UsageService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public @Nullable UsageTodayResponse getTodayUsage(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
