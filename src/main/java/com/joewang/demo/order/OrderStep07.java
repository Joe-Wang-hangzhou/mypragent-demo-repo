package com.joewang.demo.order;

public final class OrderStep07 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-07");
    }
}
