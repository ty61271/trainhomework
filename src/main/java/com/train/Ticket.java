package com.train;

public class Ticket {
    int totalTickets;
    int roundTrips;
    int singleTickets;
    double totalMoney;

    public Ticket(int totalTickets, int roundTrip) {
        this.totalTickets = totalTickets;
        this.roundTrips = roundTrip;
    }

    public void checkTickets() {
        int checkTickets=totalTickets - roundTrips;
        if (checkTickets > 0) {
            singleTickets = totalTickets - roundTrips;
            totalMoney = ((singleTickets * 1000) + (roundTrips * 2000 * 0.9));
            totalMoney();
        } else if ((checkTickets) < 0) {
            System.out.println("請重新確認總張數與來回票");
        } else {
            totalMoney = roundTrips * 2000 * 0.9;
            totalMoney();
        }
    }

    public void totalMoney() {
        System.out.println("Total tickets: " + totalTickets);
        System.out.println("Round-trip: " + roundTrips);
        System.out.println("Total: " + totalMoney);
    }
}
