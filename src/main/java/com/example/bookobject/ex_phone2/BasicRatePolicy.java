package com.example.bookobject.ex_phone2;

import com.example.bookobject.ex_movie.movie.Money;
import com.example.bookobject.ex_phone.Call;

public abstract class BasicRatePolicy implements RatePolicy{
    @Override
    public Money calculateFee(Phone phone){
        Money result = Money.ZERO;
        for(Call call:phone.getCalls()){
            result.plus(calculateCallFee(call));
        }
        return result;
    }
    protected abstract Money calculateCallFee(Call call);
}
