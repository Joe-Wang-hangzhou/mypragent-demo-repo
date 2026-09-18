package com.joewang.demo.order;

public final class OrderStep21 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-21");
    }
}
