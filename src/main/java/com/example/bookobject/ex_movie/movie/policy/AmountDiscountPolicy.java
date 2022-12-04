package com.example.bookobject.ex_movie.movie.policy;

import com.example.bookobject.ex_movie.movie.Money;
import com.example.bookobject.ex_movie.movie.Screening;
import com.example.bookobject.ex_movie.movie.condition.DiscountCondition;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
