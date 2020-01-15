package com.vertex.prof.HomeWork1;

public class Ticket {
    private int numberOfTicket;
    private int numberOfSeats;
    private int numberOfRow;
    private boolean win;

    public Ticket(int numberOfTicket, int numberOfSeats, int numberOfRow) {
        this.numberOfTicket = numberOfTicket; //ticketNumber would be a better name, same below
        this.numberOfSeats = numberOfSeats;
        this.numberOfRow = numberOfRow;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getNumberOfRow() {
        return numberOfRow;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }
}
