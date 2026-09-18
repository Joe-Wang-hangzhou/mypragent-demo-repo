package com.joewang.demo.order;

public final class OrderStep11 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-11");
    }
}
