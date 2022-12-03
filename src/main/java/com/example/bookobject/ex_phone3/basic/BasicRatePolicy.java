package com.example.bookobject.ex_phone3.basic;

import com.example.bookobject.ex_movie.movie.Money;
import com.example.bookobject.ex_phone3.Call;
import com.example.bookobject.ex_phone3.RatePolicy;
import com.example.bookobject.ex_phone3.Phone;

public abstract class BasicRatePolicy implements RatePolicy {
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
