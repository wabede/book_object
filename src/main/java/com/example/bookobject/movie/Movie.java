package com.example.bookobject.movie;

import com.example.bookobject.movie.condition.PeriodDiscountCondition;
import com.example.bookobject.movie.policy.AmountDiscountPolicy;
import com.example.bookobject.movie.policy.DiscountPolicy;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee) {
        this(title, runningTime, fee, new AmountDiscountPolicy(Money.wons(800), new SequenceDiscountCondition(1)));
    }

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return this.fee;
    }

    public Money calculateMovieFee(Screening screening) {//상영 데이터를 확인하여 할인금액 제외
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
