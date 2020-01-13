package com.vertex.prof.HomeWork1;

import java.util.*;
import java.util.stream.Collectors;

public class ListenerService {
    private List<Listener> listeners = new ArrayList<>();
    private static ListenerService INSTANCE;

    private ListenerService() {
    }

    public List<Listener> getListeners() {
        return listeners;
    }

    public static ListenerService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ListenerService();
        }
        return INSTANCE;

    }

    public void addListenerHelper(String name, int gender, int respect) {
        listeners.add(new Listener(name, ((gender == 1) ? Sex.MALE : Sex.FEMALE), respect));
    }

    public void sortedListeners() {
        listeners = listeners.stream()
                .sorted(Comparator.comparing(Listener::getSex)
                        .thenComparingInt(Listener::getRespect).reversed())
                .collect(Collectors.toList());
    }

    public Ticket compete(Map<Ticket, Listener> issuedTickets) {
        Ticket winTicket = issuedTickets.keySet().stream().max(Comparator.comparingInt(key -> issuedTickets.get(key).getRespect()))
                .orElseThrow();
        winTicket.setWin(true);
        return winTicket;
    }


    public HashSet<Listener> getListenerWithTwoTicketsOrMore(Map<Ticket, Listener> issuedTickets, int n){
        var listeners = new ArrayList<>(issuedTickets.values());
        return  (HashSet<Listener>)listeners.stream().filter(i -> Collections.frequency(listeners, i) >= n)
                .collect(Collectors.toSet());
    }


}
