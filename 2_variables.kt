package mirza.dev.kotlinbasics

// TODO -> variables are containers for storing data values.
// TODO -> to create variables in Kotlin are used "var" and "val" keywords.
// TODO -> to create variables in Kotlin are used "var" and "val" keywords.
// TODO -> "var" keyword can be changed/modified.
// TODO -> "val" keyword can't be changed/modified.

fun main(){
    createVariables()
}

fun createVariables(){

    // example of var keyword
    var myName = "Mirza Mahmud"
    myName = "Mirza Mahmud Hossan"
    var age = 25
    var salary = 35000.00
    println("My Info -> Name: $myName, Age: $age, Salary: $salary")

    // example of val keyword
    val fullName = "Mirza Mahmud"
    myName = "Mirza Mahmud Hossan"
    val myAge = 25
    val mySalary = 35000.00
    println("My Info -> Name: $fullName, Age: $myAge, Salary: $mySalary")
}