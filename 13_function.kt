package mirza.dev.kotlinbasics

// TODO -> A function is a block of code which only runs when it is called.
fun main(){
    // pre defined function
    println("This is a pre defined function")

    // call a function
    myFunction()
    myFunction("Mirza", "Mahmud")

    val result = result(10, 20)
    println("Result: $result")

    val fullName = display("Mirza", middleName = " Mahmud ", "Hossan")
    print("Full Name: $fullName")
}

fun myFunction(){
    println("own create function")
}

// TODO -> parameterized function
fun myFunction(firstName : String, lastname : String){
    println("$firstName $lastname")
}

// TODO -> return function
fun result(firstNumber: Int, secondNumber: Int) : Int {

    return firstNumber + secondNumber
}

// TODO -> Shortest Syntax of Return Function
fun display(firstName: String, middleName: String, lastname: String) = firstName + middleName + lastname