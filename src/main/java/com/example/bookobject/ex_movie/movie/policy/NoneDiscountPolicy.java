package com.example.bookobject.ex_movie.movie.policy;

import com.example.bookobject.ex_movie.movie.Money;
import com.example.bookobject.ex_movie.movie.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {


    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}