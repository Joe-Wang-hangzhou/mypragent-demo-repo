package com.joewang.demo.order;

public final class OrderStep15 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-15");
    }
}
