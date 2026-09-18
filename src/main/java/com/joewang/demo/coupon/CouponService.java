package com.joewang.demo.coupon;

public final class CouponService {

    private final CouponCounter counter;

    public CouponService(CouponCounter counter) {
        this.counter = counter;
    }

    public boolean claim(String couponId, long amount) {
        if (counter.get(couponId) < amount) {
            return false;
        }
        counter.decr(couponId, amount);
        return true;
    }
}
