package com.example.bookobject.movie.policy;

import com.example.bookobject.movie.Money;
import com.example.bookobject.movie.Screening;
import com.example.bookobject.movie.condition.DiscountCondition;

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
