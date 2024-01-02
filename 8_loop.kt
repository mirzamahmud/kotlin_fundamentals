package mirza.dev.kotlinbasics

// TODO -> Loops can execute a block of code as long as a specified condition is reached.

fun main(){
    // while
    var i : Int = 0
    while (i < 10){
        i ++
    }
    println("While Loop: $i")

    // do-while
    var j : Int = 0
    do{
        j++
    }while (j < 5)
    println("Do_While Loop: $j")
}