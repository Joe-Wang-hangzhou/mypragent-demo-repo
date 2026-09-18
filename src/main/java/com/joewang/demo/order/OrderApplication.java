package com.joewang.demo.order;

public final class OrderApplication {

    private OrderApplication() {
    }

    public static OrderResult runSample() {
        return new OrderWorkflow().execute(OrderKey.of("order-100"));
    }
}
