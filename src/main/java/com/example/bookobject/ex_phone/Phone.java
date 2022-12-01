package com.example.bookobject.ex_phone;

import com.example.bookobject.ex_movie.movie.Money;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Phone {
    private Money amount;
    private Duration seconds;
    private List<Call> calls = new ArrayList<>();

    public Phone(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }
    public void call(Call call){
        calls.add(call);
    }
    public Money calculateFee(){
        Money result = Money.ZERO;
        for(Call call:calls){
            result = result.plus(calculateCallFee(call));
        }
        return result;
    }
    private Money calculateCallFee(Call call){
        return amount.times(call.getDuration().getSeconds()/seconds.getSeconds());
    }
    public Money getAmount() {
        return amount;
    }

    public Duration getSeconds() {
        return seconds;
    }

    public List<Call> getCalls() {
        return calls;
    }
}
