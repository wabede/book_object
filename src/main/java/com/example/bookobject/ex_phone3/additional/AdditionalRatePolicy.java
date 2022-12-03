package com.example.bookobject.ex_phone3.additional;

import com.example.bookobject.ex_movie.movie.Money;
import com.example.bookobject.ex_phone2.RatePolicy;
import com.example.bookobject.ex_phone3.Phone;

public abstract class AdditionalRatePolicy implements RatePolicy {
    private RatePolicy next;
    public AdditionalRatePolicy(RatePolicy next){
        this.next = next;
    }
    @Override
    public Money calculateFee(Phone phone){
        Money fee = next.calculateFee(phone);
        return afterCalculated(fee);
    }
    abstract protected Money afterCalculated(Money fee);
}
