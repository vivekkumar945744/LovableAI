package com.vivekkumar.projects.lovable_clone.service.impl;

import com.vivekkumar.projects.lovable_clone.dto.project.FileContentResponse;
import com.vivekkumar.projects.lovable_clone.dto.project.FileNode;
import com.vivekkumar.projects.lovable_clone.service.FileService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public @Nullable List<FileNode> getFileTree(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFileContect(Long projectid, String path, Long userId) {
        return null;
    }
}
