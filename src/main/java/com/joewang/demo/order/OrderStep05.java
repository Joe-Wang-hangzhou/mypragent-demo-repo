package com.joewang.demo.order;

public final class OrderStep05 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-05");
    }
}
