package com.joewang.demo.payment;

public interface PaymentGateway {

    PaymentAttempt retry(String paymentId);
}
