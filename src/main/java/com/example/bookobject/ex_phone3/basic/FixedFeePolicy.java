package com.example.bookobject.ex_phone3.basic;

import com.example.bookobject.ex_movie.movie.Money;
import java.time.Duration;

public class FixedFeePolicy extends BasicRatePolicy {
    private Money amount;
    private Duration seconds;
    public FixedFeePolicy(Money amount, Duration seconds){
        this.amount  = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(com.example.bookobject.ex_phone3.Call call) {
        return amount.times(call.getDuration().getSeconds()/seconds.getSeconds());
    }
}
