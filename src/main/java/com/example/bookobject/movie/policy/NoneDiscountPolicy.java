package com.example.bookobject.movie.policy;

import com.example.bookobject.movie.Money;
import com.example.bookobject.movie.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {


    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}