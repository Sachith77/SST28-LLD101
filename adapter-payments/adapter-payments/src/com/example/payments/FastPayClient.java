package com.example.payments;

public class FastPayClient {
    public String payNow(String customerId, int paymentAmount) {
        return "FP#" + customerId + ":" + paymentAmount;
    }
}