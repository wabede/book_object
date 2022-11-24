package com.example.bookobject.user;

import com.example.bookobject.ticket.Ticket;

public class Audience {
    private Bag bag;
    public Audience(Bag bag){
        this.bag= bag;
    }
    public Long buy(Ticket ticket){
       return bag.hold(ticket);
    }
}