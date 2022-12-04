package com.example.bookobject.ex_phone2;

import com.example.bookobject.ex_movie.movie.Money;

public class RateDiscountablePolicy extends AdditionalRatePolicy{
    private Money discountAmount;

    public RateDiscountablePolicy(Money discountAmount, RatePolicy next) {
        super(next);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
