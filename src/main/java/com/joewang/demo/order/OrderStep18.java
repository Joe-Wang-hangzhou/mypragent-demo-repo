package com.joewang.demo.order;

public final class OrderStep18 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-18");
    }
}
