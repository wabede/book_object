package com.example.bookobject.ex_movie.movie.policy;

import com.example.bookobject.ex_movie.movie.Money;
import com.example.bookobject.ex_movie.movie.Screening;
import com.example.bookobject.ex_movie.movie.condition.DiscountCondition;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {
    private List<DiscountCondition> conditions;

    public DefaultDiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) { //screening이 할인 조건을 만족하면, 정책을 이용해 할인 요금 계산
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);//템플릿메소드

}
