package com.example.payments;

import java.util.Map;
import java.util.Objects;

public class OrderService {
    private final Map<String, PaymentGateway> paymentProviders;

    public OrderService(Map<String, PaymentGateway> paymentProviders) {
        this.paymentProviders = Objects.requireNonNull(paymentProviders, "paymentProviders cannot be null");
    }

    // Uses adapter pattern - map contains gateway adapters
    public String charge(String providerName, String customerId, int amountCents) {
        Objects.requireNonNull(providerName, "providerName cannot be null");
        PaymentGateway gateway = paymentProviders.get(providerName);
        if (gateway == null) throw new IllegalArgumentException("Unknown provider: " + providerName);
        return gateway.charge(customerId, amountCents);
    }
}
