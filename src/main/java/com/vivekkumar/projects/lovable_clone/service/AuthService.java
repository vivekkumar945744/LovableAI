package com.vivekkumar.projects.lovable_clone.service;

import com.vivekkumar.projects.lovable_clone.dto.auth.AuthResponse;
import com.vivekkumar.projects.lovable_clone.dto.auth.LoginRequest;
import com.vivekkumar.projects.lovable_clone.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    @Nullable AuthResponse login(LoginRequest request);
}
