package com.example.bookobject.ticket;

import com.example.bookobject.user.Audience;

public class Theather{
    private TicketSeller ticketSeller;
    public Theather(TicketSeller ticketSeller){
        this.ticketSeller = ticketSeller;
    }
    public void enter(Audience audience){
        ticketSeller.sellTo(audience);
    }
}