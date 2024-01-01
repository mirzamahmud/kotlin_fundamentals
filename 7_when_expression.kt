package mirza.dev.kotlinbasics

import java.util.Scanner

// TODO -> when expression is similar to the switch statement in Java.

fun main(){

    val read = Scanner(System.`in`)
    print("Enter a day: ")

    val result = when(read.nextInt()){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }

    println("Day: $result")
}