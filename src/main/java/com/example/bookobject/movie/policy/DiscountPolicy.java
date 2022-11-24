package com.example.bookobject.movie.policy;

import com.example.bookobject.movie.Money;
import com.example.bookobject.movie.Screening;


public interface DiscountPolicy {//할인 정책

     Money calculateDiscountAmount(Screening screening);
}
