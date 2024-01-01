package mirza.dev.kotlinbasics

// TODO -> Data types are divided into different groups:
// Numbers -> Number types are divided into two groups (Integer, Floating).
// Characters -> this data type is used to store a single character.
// Booleans -> this data type and can only take the values true or false.
// Strings -> this data type is used to store a sequence of characters (text).
// Arrays -> Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

fun main() {

    // TODO -> we can use "var" keyword to declare mutable variables & data types
    var myByte : Byte = 12 // The Byte data type can store whole numbers from -128 to 127
    var myShort : Short = 5000 // The Short data type can store whole numbers from -32768 to 32767
    var myInt : Int = 1213562702 // The Int data type can store whole numbers from -2147483648 to 2147483647
    var myLong : Long = 1213562702343535888 // The Long data type can store whole numbers from -9223372036854775807 to 9223372036854775807

    var myFloat : Float = 3.14F
    var myDouble : Double = 3.1416
    var myScientificNumber : Double = 12E4 // "E" or "e" to indicate the power of 10

    var isClose : Boolean = true // The Boolean data type and can only take the values "true" or "false"

    var myChar : Char = 'A' // The Char data type is used to store a single character. A char value must be surrounded by single quotes

    var myName : String = "Mirza Mahmud Hossan"

}