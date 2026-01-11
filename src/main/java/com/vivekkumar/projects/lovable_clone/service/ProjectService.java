package com.vivekkumar.projects.lovable_clone.service;

import com.vivekkumar.projects.lovable_clone.dto.project.ProjectRequest;
import com.vivekkumar.projects.lovable_clone.dto.project.ProjectResponse;
import com.vivekkumar.projects.lovable_clone.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects();

    ProjectResponse getUserProjectById(Long id);

    @Nullable ProjectResponse createProject(ProjectRequest request);

    @Nullable ProjectResponse updateProject(Long id, ProjectRequest request);

    void softDelete(Long id, Long userId);
}
