package com.joewang.demo.order;

public final class OrderStep02 {

    public OrderKey invoke(OrderKey orderKey) {
        return orderKey.withStage("step-02");
    }
}
