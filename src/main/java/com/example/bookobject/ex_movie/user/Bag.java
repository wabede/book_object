package com.example.bookobject.ex_movie.user;

import com.example.bookobject.ex_movie.ticket.Invitation;
import com.example.bookobject.ex_movie.ticket.Ticket;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Invitation invitation, long amount){ //초대 관람객
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long hold(Ticket ticket){
        if(hasInvitation()){
            setTicket(ticket);
            return 0L;
        }else{
            setTicket(ticket);
            minusAmount(ticket.getFee());
        }
        return ticket.getFee();
    }
    private boolean hasInvitation(){
        return invitation != null;
    }
    private void setTicket(Ticket ticket){
        this.amount -= amount;
    }
    private void plusAmount(Long amount){
        this.amount += amount;
    }

    public void minusAmount(Long fee) {
    }
}