package com.example.bookobject.ex_phone2;


import com.example.bookobject.ex_movie.movie.Money;
import java.time.Duration;

public class Application {
    public static void main(String[] args) {
        // 일반 요금제 + 세금 정책
        Phone phone = new Phone(new TaxablePolicy(0.05, new RegularPolicy(Money.wons(30000), Duration.ofSeconds(2))));
        // 일반 요금제 + 기본 요금 할인 정책 + 세금 정책
        Phone phone2 = new Phone(new TaxablePolicy(0.05, new RateDiscountablePolicy(Money.wons(1000),
                new RegularPolicy(Money.wons(30000), Duration.ofSeconds(2)))));
    }
}
