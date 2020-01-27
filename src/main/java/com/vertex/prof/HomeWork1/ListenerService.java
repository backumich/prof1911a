package com.vertex.prof.HomeWork1;

import java.util.*;
import java.util.stream.Collectors;

public class ListenerService {
    private List<Listener> listeners = new ArrayList<>();
    private static ListenerService INSTANCE;

    private ListenerService() {
    }


    public static ListenerService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ListenerService();
        }
        return INSTANCE;

    }

    public void addListener(Listener listener) { //I'd prefer this method to get Listener as param, not those 3.
        // And logic of getting sex from a magic number should be situated inside class that owns this magic number.
        // One more question, what does 'Helper' means? I read it as a helper for Listener
        listeners.add(listener);
    }

    public List<Listener> getSortedListeners() { //it should be named as 'sortListeners'.
        // With name 'sortedListeners' it should return a new one collection of listeners that is sorted.
       return listeners.stream()
                .sorted(Comparator.comparing(Listener::getSex)
                        .thenComparingInt(Listener::getRespect).reversed())
                .collect(Collectors.toList());
    }

    public Ticket compete(Map<Ticket, Listener> issuedTickets) {
        Ticket winTicket = issuedTickets.keySet().stream()
                .max(Comparator.comparingInt(key -> issuedTickets.get(key).getRespect())) //made it a little bit readable
                .orElseThrow();
        winTicket.setWin(true);
        return winTicket;
    }


    public Set<Listener> getListenerWithTwoTicketsOrMore(Map<Ticket, Listener> issuedTickets, int n){ // please return Set instead of exact realisation
        var listeners = new ArrayList<>(issuedTickets.values());
        return  listeners.stream() // so you could get rid of this casting. Casting is bad!
                .filter(i -> Collections.frequency(listeners, i) >= n)
                .collect(Collectors.toSet());
    }


}
