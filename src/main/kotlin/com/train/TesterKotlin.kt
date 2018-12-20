package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    val totalTicket = scanner.nextInt()
    print("How many round-trip tickets: ")
    val roundTrip = scanner.nextInt()
    val ticket = TicketKotlin(totalTicket, roundTrip)
    ticket.tatalMoney()
}

class TicketKotlin(val totalTicket: Int, val roundTrip: Int) {
    fun tatalMoney() {
        val singleTicket = totalTicket - roundTrip
        val totalMoney = (singleTicket * 1000) + (roundTrip * 2000 * 0.9)
        print(totalMoney)
    }
}