package com.example.bookobject.movie.policy;

import com.example.bookobject.movie.Money;
import com.example.bookobject.movie.Screening;

public class NoneDiscountPolicy extends DiscountPolicy{
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }

}