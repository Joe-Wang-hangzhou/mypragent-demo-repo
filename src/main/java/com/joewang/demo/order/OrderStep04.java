package com.joewang.demo.order;

public final class OrderStep04 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-04");
    }
}
