package com.example.bookobject.ex_movie.movie;

import com.example.bookobject.ex_movie.movie.condition.DiscountCondition;

public class SequenceDiscountCondition implements DiscountCondition {
    private int sequence;

    public SequenceDiscountCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
