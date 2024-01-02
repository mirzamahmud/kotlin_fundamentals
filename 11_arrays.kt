package mirza.dev.kotlinbasics

fun main(){

    // declare array
    val numbersArray : Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Array of Numbers: ${numbersArray[5]}")

    // change array element
    numbersArray[1] = 12
    println("Change array element: ${numbersArray[1]}")

    // array length
    println("Array length: ${numbersArray.size}")

    // Check if an element exists
    if(7 in numbersArray){
        println("Exists")
    }
    else{
        println("Doesn't exists")
    }

    // loop through an array
    for (i in numbersArray){
        println("Number: $i")
    }
}