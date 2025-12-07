package com.vivekkumar.projects.lovable_clone.service.impl;

import com.vivekkumar.projects.lovable_clone.dto.subscription.CheckoutRequest;
import com.vivekkumar.projects.lovable_clone.dto.subscription.CheckoutResponse;
import com.vivekkumar.projects.lovable_clone.dto.subscription.PortalResponse;
import com.vivekkumar.projects.lovable_clone.dto.subscription.SubscriptionResponse;
import com.vivekkumar.projects.lovable_clone.service.SubscriptionService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public @Nullable SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public @Nullable CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
