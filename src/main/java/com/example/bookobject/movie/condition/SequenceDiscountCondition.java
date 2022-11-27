package com.example.bookobject.movie.condition;

import com.example.bookobject.movie.Screening;

public class SequenceDiscountCondition {
    private int sequence;
    public SequenceDiscountCondition(int sequence){
        this.sequence=sequence;
    }
    public boolean isSatisfiedBy(Screening screening){
        return screening.isSequence(sequence);
    }
}
