package com.example.bookobject.ticket;

import com.example.bookobject.user.Audience;

public class TicketSeller{
    private TicketOffice ticketOffice;
    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }
    void sellTo(Audience audience){
        ticketOffice.sellTicketTo(audience);
    }
}