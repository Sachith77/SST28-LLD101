package com.example.payments;

public class SafeCashClient {
    public SafeCashPayment createPayment(int paymentAmount, String userId) {
        return new SafeCashPayment(paymentAmount, userId);
    }
}
