package com.example.bookobject.ex_phone3.additional;

import com.example.bookobject.ex_movie.movie.Money;
import com.example.bookobject.ex_phone2.AdditionalRatePolicy;
import com.example.bookobject.ex_phone2.RatePolicy;

public class TaxablePolicy extends AdditionalRatePolicy {
    private double taxRatio;

    public TaxablePolicy(double taxRatio, RatePolicy next) {
        super(next);
        this.taxRatio = taxRatio;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRatio));
    }
}
