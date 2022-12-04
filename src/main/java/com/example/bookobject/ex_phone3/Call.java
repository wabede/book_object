package com.example.bookobject.ex_phone3;

import com.example.bookobject.ex_phone3.basic.timeofday.DateTimeInterval;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Call {
    private DateTimeInterval interval;

    public Call(LocalDateTime plus, LocalDateTime localDateTime) {

    }

    public Duration getDuration() {
        return interval.duration();
    }

    public LocalDateTime getFrom() {
        return interval.getFrom();
    }

    public LocalDateTime getTo() {
        return interval.getTo();
    }

    public DateTimeInterval getInterval() {
        return interval;
    }

    public List<DateTimeInterval> splitByDay() {
        return interval.splitByDay();
    }
}
