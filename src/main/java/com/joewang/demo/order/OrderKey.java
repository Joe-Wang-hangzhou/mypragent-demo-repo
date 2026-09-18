package com.joewang.demo.order;

public record OrderKey(String value) {

    public static OrderKey of(String value) {
        return new OrderKey(value);
    }

    public static OrderKey from(String value) {
        return of(value);
    }

    public OrderKey withStage(String stage) {
        return new OrderKey(stage + ":" + value);
    }
}
