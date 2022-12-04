package com.example.bookobject.ex_phone2;

import com.example.bookobject.ex_movie.movie.Money;
import com.example.bookobject.ex_phone.Call;
import java.time.Duration;

public class RegularPolicy extends BasicRatePolicy{
    private Money amount;
    private Duration seconds;
    public RegularPolicy(Money amount,Duration seconds){
        this.amount  = amount;
        this.seconds = seconds;
    }
    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds()/seconds.getSeconds());
    }
}
