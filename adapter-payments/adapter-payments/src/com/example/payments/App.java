package com.example.payments;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<String, PaymentGateway> paymentProviders = new HashMap<>();

        paymentProviders.put("fastpay", new FastPayAdapter(new FastPayClient()));
        paymentProviders.put("safecash", new SafeCashAdapter(new SafeCashClient()));

        OrderService orderProcessor = new OrderService(paymentProviders);

        String transactionId1 = orderProcessor.charge("fastpay", "sachith-001", 1299);
        String transactionId2 = orderProcessor.charge("safecash", "sachith-002", 1299);

        System.out.println(transactionId1);
        System.out.println(transactionId2);
    }
}