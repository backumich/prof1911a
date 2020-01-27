package com.vertex.prof.HomeWork1;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CashBox {
    private static CashBox INSTANCE;
    private int ticketCounter = 0;

    private CashBox() {
    }

    public static CashBox getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CashBox();
        }
        return INSTANCE;
    }

    public Map<Ticket, Listener> issueTickets(Collection<Listener> listeners) {
        Map<Ticket, Listener> issuedTickets = new HashMap<>();
        for (Listener listener : listeners) {
            int random = (int) (Math.random() * 3) + 1;
            for (int i = 0; i < random; i++) {
                issuedTickets.put(createTicket(), listener);
            }
        }
        return issuedTickets;
    }

    private Ticket createTicket() {
        //ticketCounter++; //there is a single responsibility principle and this action violates it.
        return new Ticket(ticketCounter++);
    }




}
