package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("歡迎光臨連續訂票系統，如想結束訂票請在購票張數輸入-1");
        Scanner scanner = new Scanner(System.in);
        int totalTickets = 0;
        while (totalTickets != -1) {
            System.out.print("Please enter number of tickets: ");
            totalTickets = scanner.nextInt();
            if (totalTickets > 0) {
                System.out.print("How many round-trip tickets: ");
                int roundTrip = scanner.nextInt();
                Ticket ticket = new Ticket(totalTickets, roundTrip);
                ticket.checkTickets();
            } else if (totalTickets == -1) {
                System.out.println("結束訂票");
            } else {
                System.out.println("請重新確認張數: ");
            }
        }
    }
}

