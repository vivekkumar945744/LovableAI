package com.vivekkumar.projects.lovable_clone.entity;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Primary;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {


    Long id;

    String email;
    String passwordHash;
    String avatarUrl;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
