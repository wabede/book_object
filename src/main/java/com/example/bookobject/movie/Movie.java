package com.example.bookobject.movie;

import com.example.bookobject.movie.policy.DiscountPolicy;
import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;
    public Money getFee() {
        return this.fee;
    }

    public Money calculateMovieFee(Screening screening) {//상영 데이터를 확인하여 할인금액 제외
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
