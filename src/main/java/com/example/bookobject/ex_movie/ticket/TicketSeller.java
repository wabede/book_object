package com.example.bookobject.ex_movie.ticket;

import com.example.bookobject.ex_movie.user.Audience;

public class TicketSeller{
    private TicketOffice ticketOffice;
    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }
    void sellTo(Audience audience){
        ticketOffice.sellTicketTo(audience);
    }
}