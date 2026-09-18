package com.joewang.demo.coupon;

public final class CouponService {

    private final CouponCounter counter;

    public CouponService(CouponCounter counter) {
        this.counter = counter;
    }

    public boolean claim(String couponId, long amount) {
        if (couponId == null || couponId.isBlank() || amount <= 0) {
            throw new IllegalArgumentException("coupon id and positive amount are required");
        }
        return counter.decrementIfAvailable(couponId, amount);
    }
}
