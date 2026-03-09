package com.example.payments;

public class SafeCashPayment {
    private final int paymentAmount; 
    private final String userId;
    
    public SafeCashPayment(int paymentAmount, String userId) { 
        this.paymentAmount = paymentAmount; 
        this.userId = userId; 
    }
    
    public String confirm() { 
        return "SC#pay(" + userId + "," + paymentAmount + ")"; 
    }
}
