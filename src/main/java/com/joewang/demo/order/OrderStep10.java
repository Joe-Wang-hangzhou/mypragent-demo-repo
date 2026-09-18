package com.joewang.demo.order;

public final class OrderStep10 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-10");
    }
}
