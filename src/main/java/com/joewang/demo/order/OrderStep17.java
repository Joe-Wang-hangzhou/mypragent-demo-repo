package com.joewang.demo.order;

public final class OrderStep17 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-17");
    }
}
