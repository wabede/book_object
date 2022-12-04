package com.example.bookobject.ex_movie.ticket;

import com.example.bookobject.ex_movie.user.Audience;

public class Theather{
    private TicketSeller ticketSeller;
    public Theather(TicketSeller ticketSeller){
        this.ticketSeller = ticketSeller;
    }
    public void enter(Audience audience){
        ticketSeller.sellTo(audience);
    }
}