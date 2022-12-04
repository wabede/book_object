package com.example.bookobject.ex_phone3.additional;

import com.example.bookobject.ex_movie.movie.Money;
import com.example.bookobject.ex_phone2.AdditionalRatePolicy;
import com.example.bookobject.ex_phone2.RatePolicy;

public class RateDiscountablePolicy extends AdditionalRatePolicy {
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
