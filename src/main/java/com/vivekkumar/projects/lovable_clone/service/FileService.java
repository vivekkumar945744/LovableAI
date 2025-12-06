package com.vivekkumar.projects.lovable_clone.service;

import com.vivekkumar.projects.lovable_clone.dto.project.FileContentResponse;
import com.vivekkumar.projects.lovable_clone.dto.project.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FileService {
    @Nullable List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContect(Long projectid, String path, Long userId);
}
