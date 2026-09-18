package com.joewang.demo.order;

public final class OrderStep01 {

    public String invoke(String orderId) {
        return "step-01:" + orderId;
    }
}
