package com.joewang.demo.payment;

public final class PaymentRetryService {

    private final PaymentGateway gateway;
    private final RetryConfig config;

    public PaymentRetryService(PaymentGateway gateway, RetryConfig config) {
        this.gateway = gateway;
        this.config = config;
    }

    public PaymentAttempt retry(String paymentId) {
        return gateway.retry(paymentId);
    }
}
