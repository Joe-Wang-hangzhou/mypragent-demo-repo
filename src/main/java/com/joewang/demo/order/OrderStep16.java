package com.joewang.demo.order;

public final class OrderStep16 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-16");
    }
}
