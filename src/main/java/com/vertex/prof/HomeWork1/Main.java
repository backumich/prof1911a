package com.vertex.prof.HomeWork1;


import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static ListenerService listenersService = ListenerService.getInstance();
    private static CashBox cashBox = CashBox.getINSTANCE();
    // there is a Java naming convention https://www.javatpoint.com/java-naming-conventions
    // please follow it.

    public static void main(String[] args) {
        addListener();
        Map<Ticket, Listener> issuedTickets= cashBox.issueTickets(listenersService.getListeners());
        Ticket winTicket = listenersService.compete(issuedTickets);
        System.out.println(issuedTickets.get(winTicket));

    }


    private static void addListener() {
        while (true) {
            System.out.println("1 - add Listener, 0 - end");
            int action = scanner.nextInt();
            if (action == 1) { // added new lines as separations of different steps
                System.out.println("Enter name Listener");
                String name = scanner.next();

                System.out.println("Select sex, if male (1), if female (0)");
                int gender = scanner.nextInt();
                if (gender != 1 && gender != 0) {
                    System.out.println("Incorrect number");
                    addListener();
                }

                System.out.println("Enter respect");
                int respect = scanner.nextInt();

                listenersService.addListenerHelper(name, gender, respect);
                listenersService.sortedListeners(); //Bad approach - you are changing the inner collection from outside. I'd prefer to get sorted listeners once the queue is totally filled.
                System.out.println(listenersService.getListeners()); // combine getListeners and sortedListeners into getSortedListeners.
            } else {
                break;
            }
        }
    }



}
