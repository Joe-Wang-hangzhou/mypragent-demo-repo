package com.joewang.demo.order;

public final class OrderStep12 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-12");
    }
}
