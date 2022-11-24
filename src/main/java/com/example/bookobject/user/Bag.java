package com.example.bookobject.user;

import com.example.bookobject.ticket.Invitation;
import com.example.bookobject.ticket.Ticket;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(long amount){ //일반 관람객
        this(null,amount);
    }
    public Bag(Invitation invitation, long amount){ //초대 관람객
        this.invitation = invitation;
        this.amount = amount;
    }
    public boolean hasInvitation(){
        return invitation != null;
    }
    public boolean hasTicket(){
        return ticket != null;
    }
    public void setTicket(Ticket ticket){
        this.amount -= amount;
    }
    public void plusAmount(Long amount){
        this.amount += amount;
    }

    public void minusAmount(Long fee) {
    }
}