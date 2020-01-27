package com.vertex.prof.HomeWork1;

public class Ticket {
    private int ticketNumber;
    private int seatNumber;
    private int rowNumber;
    private boolean win;


    public Ticket(int ticketNumber) {
        this.ticketNumber = ticketNumber; //ticketNumber would be a better name, same below
        this.seatNumber = ticketNumber;
        this.rowNumber = ticketNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber=" + ticketNumber +
                ", seatNumber=" + seatNumber +
                ", rowNumber=" + rowNumber +
                ", win=" + win +
                '}';
    }
}
