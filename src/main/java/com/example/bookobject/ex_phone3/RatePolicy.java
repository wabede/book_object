package com.example.bookobject.ex_phone3;

import com.example.bookobject.ex_movie.movie.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
