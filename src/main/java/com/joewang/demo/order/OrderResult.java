package com.joewang.demo.order;

public record OrderResult(OrderKey key) {

    public String finalOrderId() {
        return key.value();
    }
}
