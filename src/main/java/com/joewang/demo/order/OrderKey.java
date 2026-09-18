package com.joewang.demo.order;

public record OrderKey(String value) {

    public static OrderKey of(String value) {
        return new OrderKey(value);
    }
}
