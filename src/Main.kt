import kotlin.random.Random

fun generateSupplyDropper(): String {
    return arrayOf("Andrew", "Doug", "April", "Bob", "Devin", "Stone", "Danielle", "Maxfield", "Maxo", "Carson", "Kristi").random()
}


fun main() {

    print("Please give me a noun. Any noun: ")
    val inputNoun = readLine()

    print("Now give me an adjective: ")
    val inputAdj = readLine()

    print("Finally, a verb: ")
    val inputVerb = readLine()

    val randomSupplyDropper = generateSupplyDropper()
    println()
    println("The quote of the day is: $randomSupplyDropper ${inputVerb + "s"} a $inputAdj $inputNoun")

}