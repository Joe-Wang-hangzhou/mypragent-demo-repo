package com.joewang.demo.order;

public final class OrderStep09 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-09");
    }
}
