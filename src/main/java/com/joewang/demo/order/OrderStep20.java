package com.joewang.demo.order;

public final class OrderStep20 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-20");
    }
}
