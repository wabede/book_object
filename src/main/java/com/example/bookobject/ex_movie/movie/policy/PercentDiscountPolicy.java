package com.example.bookobject.ex_movie.movie.policy;

import com.example.bookobject.ex_movie.movie.Money;
import com.example.bookobject.ex_movie.movie.Screening;
import com.example.bookobject.ex_movie.movie.condition.DiscountCondition;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
