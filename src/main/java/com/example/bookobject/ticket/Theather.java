package com.example.bookobject.ticket;

import com.example.bookobject.user.Audience;

public class Theather{
    private TicketSeller ticketSeller;
    public Theather(TicketSeller ticketSeller){
        this.ticketSeller = ticketSeller;
    }
    public void enter(Audience audience){
        if(audience.getBag().hasInvitation()){ //극장이 관객의 가방을 뒤져서 초대권이 있는지 확인
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        }else{
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}