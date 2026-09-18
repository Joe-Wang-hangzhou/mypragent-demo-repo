package com.joewang.demo.order;

public final class OrderStep13 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-13");
    }
}
