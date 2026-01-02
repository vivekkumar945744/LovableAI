package com.vivekkumar.projects.lovable_clone.mapper;

import com.vivekkumar.projects.lovable_clone.dto.auth.SignupRequest;
import com.vivekkumar.projects.lovable_clone.dto.auth.UserProfileResponse;
import com.vivekkumar.projects.lovable_clone.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    UserProfileResponse toUserProfile(User user);
}
