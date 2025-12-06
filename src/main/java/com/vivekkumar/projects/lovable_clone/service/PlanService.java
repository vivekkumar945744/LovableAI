package com.vivekkumar.projects.lovable_clone.service;

import com.vivekkumar.projects.lovable_clone.dto.subscription.PlanResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface PlanService {
    @Nullable List<PlanResponse> getAllActivePlans();
}
