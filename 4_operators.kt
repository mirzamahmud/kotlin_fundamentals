package mirza.dev.kotlinbasics

// TODO -> Kotlin divides the operators into the following groups
// Arithmetic Operators
// Assignment Operators
// Comparison Operators
// Logical Operators

fun main(){

    val firstNumber : Int = 10
    val secondNumber : Int = 20
    val thirdNumber : Int = 30

    exampleOfArithmeticOperators(firstNumber, secondNumber, thirdNumber)
    exampleOfAssignmentOperators()
    exampleOfComparisonOperators(firstNumber, secondNumber)
    exampleOfLogicalOperators(secondNumber, thirdNumber)
}

// TODO -> arithmetic operators example
fun exampleOfArithmeticOperators(firstNumber : Int, secondNumber : Int, thirdNumber : Int){
    // addition
    println("Addition: ${firstNumber + secondNumber}")
    // subtraction
    println("Subtraction: ${thirdNumber - secondNumber}")
    // multiplication
    println("Multiplication: ${firstNumber * secondNumber}")
    // division
    println("Division: ${thirdNumber / firstNumber}")
    // modulus
    println("Modulus: ${thirdNumber % secondNumber}")
    // increment
    var x : Int = 0
    println("Increment: ${++x}")
    // decrement
    var y : Int = 10
    println("Decrement: ${--y}")
}

fun exampleOfAssignmentOperators(){
    // equal
    var fourthNumber : Int = 10
    println("Equal To: $fourthNumber")
    // plus_equal
    fourthNumber += 10 // -> it is similar to fourthNumber = fourthNumber + 10
    println("Plus Equal: $fourthNumber")
    // minus_equal
    fourthNumber -= 5
    println("Minus Equal: $fourthNumber")
    // multiply_equal
    fourthNumber *= 5
    println("Multiply Equal: $fourthNumber")
    // division_equal
    fourthNumber /= 5
    println("Division Equal: $fourthNumber")
    // modulus_equal
    fourthNumber %= 4
    println("Modulus Equal: $fourthNumber")
}

fun exampleOfComparisonOperators(firstNumber: Int, secondNumber: Int){
    // equal_to
    println("Equal To: ${firstNumber == secondNumber}")
    // not_equal
    println("Not Equal: ${firstNumber != secondNumber}")
    // greater_than
    println("Greater Than: ${secondNumber > firstNumber}")
    // less_than
    println("Less Than: ${firstNumber < secondNumber}")
    // greater_than_or_equal_to
    println("Less Than: ${firstNumber >= secondNumber}")
    // less_than_or_equal_to
    println("Less Than: ${secondNumber <= firstNumber}")
}

fun exampleOfLogicalOperators(secondNumber: Int, thirdNumber: Int){
    // logical_and
    println("Logical AND: ${secondNumber == 5 && thirdNumber != 10}")
    // logical_or
    println("Logical OR: ${secondNumber == 5 && thirdNumber != 10}")
    // logical_not
    println("Logical NOT: ${secondNumber != thirdNumber}")
}