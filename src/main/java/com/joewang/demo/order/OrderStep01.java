package com.joewang.demo.order;

public final class OrderStep01 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-01");
    }
}
