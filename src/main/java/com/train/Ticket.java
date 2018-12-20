package com.train;

public class Ticket {
    int totalTickets;
    int roundTrip;

    public Ticket(int totalTickets, int roundTrip) {
        this.totalTickets = totalTickets;
        this.roundTrip = roundTrip;
    }

    public void totalMoney() {
        int singleTickets = totalTickets - roundTrip;
        double totalMoney = ((singleTickets * 1000) + (roundTrip * 2000 * 0.9));
        System.out.println("Total tickets: "+totalTickets);
        System.out.println("Round-trip: "+roundTrip);
        System.out.println("Total: "+totalMoney);
    }
}
