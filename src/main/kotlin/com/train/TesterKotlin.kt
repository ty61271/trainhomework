package com.train

import java.util.*

fun main(args: Array<String>) {
    println("歡迎光臨連續訂票系統，如想結束訂票請在購票張數輸入-1")
    val scanner = Scanner(System.`in`)
    var totalTicket=0
    while (totalTicket!=-1){
        print("Please enter number of tickets: ")
        totalTicket = scanner.nextInt()
        if(totalTicket>0){
            print("How many round-trip tickets: ")
            val roundTrip = scanner.nextInt()
            val ticket = TicketKotlin(totalTicket, roundTrip)
            ticket.checkTickets()
        }else if(totalTicket==-1){
            println("結束訂票")
        }else{
            println("請重新確認張數: ")
        }
    }

}

class TicketKotlin(val totalTickets: Int, val roundTrips: Int) {
    var singleTickets: Int = 0
    var totalMoney: Double = 0.0

    fun checkTickets() {
        val checkTicket = totalTickets - roundTrips
        if (checkTicket > 0) {
            singleTickets = totalTickets - roundTrips
            totalMoney = (singleTickets * 1000) + (roundTrips * 2000 * 0.9)
            totalMoney()
        } else if (checkTicket < 0) {
            println("請重新確認總張數與來回票")
        } else {
            totalMoney = roundTrips * 2000 * 0.9
            totalMoney()
        }
    }

    fun totalMoney() {
        println("Total tickets: $totalTickets")
        println("Round-trip: $roundTrips")
        println("Total: $totalMoney")
    }
}