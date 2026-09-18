package com.joewang.demo.order;

public final class OrderStep06 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-06");
    }
}
