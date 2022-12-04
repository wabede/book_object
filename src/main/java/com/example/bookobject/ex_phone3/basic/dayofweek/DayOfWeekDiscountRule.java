package com.example.bookobject.ex_phone3.basic.dayofweek;

import com.example.bookobject.ex_movie.movie.Money;
import com.example.bookobject.ex_phone3.basic.timeofday.DateTimeInterval;
import java.time.DayOfWeek;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DayOfWeekDiscountRule {
    private List<DayOfWeek> dayOfWeeks = new ArrayList<>();
    private Duration duration = Duration.ZERO;
    private Money amount = Money.ZERO;

    public DayOfWeekDiscountRule(List<DayOfWeek> dayOfWeeks, Duration duration, Money amount) {
        this.dayOfWeeks = dayOfWeeks;
        this.duration = duration;
        this.amount = amount;
    }

    public Money calculate(DateTimeInterval interval) {
        if (dayOfWeeks.contains(interval.getFrom().getDayOfWeek())) {
            return amount.times(interval.duration().getSeconds() / duration.getSeconds());
        }
        return Money.ZERO;
    }
}
