package com.vivekkumar.projects.lovable_clone.service;

import com.vivekkumar.projects.lovable_clone.dto.subscription.CheckoutRequest;
import com.vivekkumar.projects.lovable_clone.dto.subscription.CheckoutResponse;
import com.vivekkumar.projects.lovable_clone.dto.subscription.PortalResponse;
import com.vivekkumar.projects.lovable_clone.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    @Nullable SubscriptionResponse getCurrentSubscription(Long userId);

    @Nullable CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
