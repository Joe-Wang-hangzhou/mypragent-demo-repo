package com.joewang.demo.order;

public final class OrderStep19 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-19");
    }
}
