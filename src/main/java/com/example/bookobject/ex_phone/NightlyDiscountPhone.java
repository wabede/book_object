package com.example.bookobject.ex_phone;

import com.example.bookobject.ex_movie.movie.Money;
import java.time.Duration;

public class NightlyDiscountPhone extends Phone {
    private static final int LATE_NIGHT_HOUR = 22;
    private Money nightlyAmount;

    public NightlyDiscountPhone(Money amount, Duration seconds) {
        super(amount, seconds);
    }

    @Override
    public Money calculateFee() {
        Money result = super.calculateFee();
        Money nightlyFee = Money.ZERO;
        for (Call call : getCalls()) {
            if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
                nightlyFee = nightlyFee.plus(nightlyAmount.times(call.getDuration().getSeconds() / getSeconds().getSeconds()));
            }
        }
        return result.minus(nightlyFee);
    }
}
