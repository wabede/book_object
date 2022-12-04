package com.example.bookobject.ex_movie.movie.condition;

import com.example.bookobject.ex_movie.movie.Screening;

public interface DiscountCondition {
     boolean isSatisfiedBy(Screening screening) ;
}
