package com.joewang.demo.order;

public final class OrderStep23 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-23");
    }
}
