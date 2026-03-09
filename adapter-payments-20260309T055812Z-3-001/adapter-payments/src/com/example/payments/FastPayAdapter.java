package com.example.payments;

import java.util.Objects;

public class FastPayAdapter implements PaymentGateway {

    private final FastPayClient paymentClient;

    public FastPayAdapter(FastPayClient paymentClient) {
        this.paymentClient = Objects.requireNonNull(paymentClient);
    }

    @Override
    public String charge(String customerId, int amountCents) {
        Objects.requireNonNull(customerId, "customerId cannot be null");
        return paymentClient.payNow(customerId, amountCents);
    }
}