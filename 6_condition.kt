package mirza.dev.kotlinbasics

import java.util.Scanner

fun main(){

    val read = Scanner(System.`in`)
    print("Enter an integer number: ")

    val number = read.nextInt()

    if(number % 2 == 0){
        print("$number is Even")
    }
    else{
        print("$number is Odd")
    }
}