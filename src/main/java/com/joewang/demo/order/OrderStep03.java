package com.joewang.demo.order;

public final class OrderStep03 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-03");
    }
}
