package com.vivekkumar.projects.lovable_clone.entity;

import com.vivekkumar.projects.lovable_clone.enums.SubscriptionStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {

    String id;
    String name;

    SubscriptionStatus status;
    String stripePriceId;
    String maxTokensPerDay;
    Integer maxProjects;
    Integer maxPreviews;
    Boolean unlimitedAt; // unlimited access to LLm, ignore maxTokensPerDay  if True

    Boolean active;

}
