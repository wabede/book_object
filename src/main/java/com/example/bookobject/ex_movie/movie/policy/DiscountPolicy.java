package com.example.bookobject.ex_movie.movie.policy;

import com.example.bookobject.ex_movie.movie.Money;
import com.example.bookobject.ex_movie.movie.Screening;


public interface DiscountPolicy {//할인 정책

     Money calculateDiscountAmount(Screening screening);
}
