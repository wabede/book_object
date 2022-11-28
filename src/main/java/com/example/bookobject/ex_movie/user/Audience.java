package com.example.bookobject.ex_movie.user;

import com.example.bookobject.ex_movie.ticket.Ticket;

public class Audience {
    private Bag bag;
    public Audience(Bag bag){
        this.bag= bag;
    }
    public Long buy(Ticket ticket){
       return bag.hold(ticket);
    }
}