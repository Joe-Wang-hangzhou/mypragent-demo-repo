package com.joewang.demo.payment;

public record PaymentAttempt(String paymentId, String idempotencyKey) {
}
