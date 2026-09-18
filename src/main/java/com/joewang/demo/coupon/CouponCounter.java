package com.joewang.demo.coupon;

public interface CouponCounter {

    long get(String couponId);

    long decr(String couponId, long amount);

    boolean decrementIfAvailable(String couponId, long amount);
}
