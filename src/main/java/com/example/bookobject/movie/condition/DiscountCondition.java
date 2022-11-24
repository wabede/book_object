package com.example.bookobject.movie.condition;

import com.example.bookobject.movie.Screening;

public interface DiscountCondition {
     boolean isSatisfiedBy(Screening screening) ;
}
