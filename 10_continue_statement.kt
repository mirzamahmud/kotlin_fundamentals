package mirza.dev.kotlinbasics

// TODO -> "continue" statement breaks one iteration in the loop, if a specified condition occurs, and continues with the next iteration in the loop.

fun main(){
    var i : Int = 0;

    while (i < 10){
        if(i == 5){
            i++
            continue
        }
        println("index: $i")
        i ++
    }
}