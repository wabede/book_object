package com.example.bookobject.ex_phone;

import com.example.bookobject.ex_movie.movie.Money;
import java.time.Duration;

public class NightlyDiscountPhone extends Phone {
    private static final int LATE_NIGHT_HOUR = 22;
    private Money nightlyAmount;
    private Money regularAmount;
    private Duration seconds;

    public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds, double taxRate) {
        super(taxRate);
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }

    @Override
    public Money calculateCallFee(Call call) {
        if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
            return nightlyAmount.times(call.getDuration().getSeconds() / seconds.getSeconds());
        } else {
            return regularAmount.times(call.getDuration().getSeconds() / seconds.getSeconds());
        }
    }
}
