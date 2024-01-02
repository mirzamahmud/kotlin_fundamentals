package mirza.dev.kotlinbasics

// TODO -> Unlike Java and other programming languages, there is no traditional for loop in Kotlin.
// TODO -> In Kotlin, the for loop is used to loop through arrays, ranges, and other things that contains a countable number of values.
fun main(){

    val cars : Array<String> = arrayOf("Volvo", "BMW", "Ford", "Mazda")

    for (x in cars) {
        println("Car: $x")
    }
}