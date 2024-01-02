package mirza.dev.kotlinbasics

// TODO -> "break" statement is used to jump out of a loop.

fun main(){
    var i : Int = 0;
    while (i < 5){
        if(i == 3){
            break
        }
        println(i)
        i ++
    }
}