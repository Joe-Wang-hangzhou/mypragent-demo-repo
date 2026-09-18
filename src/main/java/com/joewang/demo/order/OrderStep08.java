package com.joewang.demo.order;

public final class OrderStep08 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-08");
    }
}
