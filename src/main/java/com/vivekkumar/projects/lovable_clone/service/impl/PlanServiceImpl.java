package com.vivekkumar.projects.lovable_clone.service.impl;

import com.vivekkumar.projects.lovable_clone.dto.subscription.PlanResponse;
import com.vivekkumar.projects.lovable_clone.service.PlanService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public @Nullable List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
