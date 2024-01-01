package mirza.dev.kotlinbasics

// TODO -> Strings are used for storing text. A string contains a collection of characters surrounded by double quotes

fun main(){
    // declare string
    val fullName : String = "Mirza Mahmud Hossan"
    println("Name: $fullName")

    // access character of a string
    println("Access First Character from FullName: ${fullName[0]}")
    println("Access Second Character from FullName: ${fullName[1]}")

    // string length
    println("The length of the fullName is: " + fullName.length)

    // string function
    println("UpperCase : " + fullName.uppercase())
    println("LowerCase : " + fullName.lowercase())

    // comparing string
    val name : String = "Mirza"
    println("Compare String : " + fullName.compareTo(name))

    // finding string in a string
    println("Finding String: " + fullName.indexOf("Mahmud"))

    // string concatenation
    val firstName : String = "Mirza"
    val middleName : String = "Mahmud"
    val lastName : String = "Hossan"

    println("Concat String with plus(): ${firstName.plus(middleName).plus(lastName)}")

    // string interpolation
    println("Interpolation String: $firstName $middleName $lastName")
}