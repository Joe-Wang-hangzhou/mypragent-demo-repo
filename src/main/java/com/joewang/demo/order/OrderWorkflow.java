package com.joewang.demo.order;

public final class OrderWorkflow {

    public OrderResult execute(OrderKey key) {
        OrderRequest request = new OrderRequest(key);
        OrderKey current = request.key();
        current = new OrderStep01().invoke(current);
        current = new OrderStep02().invoke(current);
        current = new OrderStep03().invoke(current);
        current = new OrderStep04().invoke(current);
        current = new OrderStep05().invoke(current);
        current = new OrderStep06().invoke(current);
        current = new OrderStep07().invoke(current);
        current = new OrderStep08().invoke(current);
        current = new OrderStep09().invoke(current);
        current = new OrderStep10().invoke(current);
        current = new OrderStep11().invoke(current);
        current = new OrderStep12().invoke(current);
        current = new OrderStep13().invoke(current);
        current = new OrderStep14().invoke(current);
        current = new OrderStep15().invoke(current);
        current = new OrderStep16().invoke(current);
        current = new OrderStep17().invoke(current);
        current = new OrderStep18().invoke(current);
        current = new OrderStep19().invoke(current);
        current = new OrderStep20().invoke(current);
        current = new OrderStep21().invoke(current);
        current = new OrderStep22().invoke(current);
        current = new OrderStep23().invoke(current);
        return new OrderResult(current);
    }
}
