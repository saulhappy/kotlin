import kotlin.random.Random

fun generateSupplyDropper(): String {
    return arrayOf("Andrew", "Doug", "April", "Bob", "Devin", "Stone", "Danielle", "Maxfield", "Maxo", "Carson", "Kristi").random()
}

fun getRandomNorrisJoke(): String {
    return arrayOf("Chuck Norris knows the meaning of every word known to man... except mercy.",
            "Chuck Norris was the first avenger.",
            "Chuck Norris updates his DNA every 5 minutes",
            "Harry potter is Chuck Norris's love child",
            "Chuck Norris once raised over $2.5 billion for charity in 2 hours using the slogan 'Give, or I'll hurt you.'",
            "Some people go their whole lives never realizing they are but a figment of Chuck Norris' imagination.",
            "Chuck Norris's spit is the cure(they dont want you to know) for COVID-19.",
            "Chuck Norris doesn't love Raymond.",
            "Jehovah is the Hebrew word for Chuck Norris",
            "Chuck Norris jogs for an hour every morning at 6am. He finishes at 5am.").random()
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
    println()
    val chuckNorrisJoke = getRandomNorrisJoke()
    println("Press ENTER to get your random Chuck Norris joke for the day: ")
    val showNorrisJoke = readLine()
    println("$chuckNorrisJoke")
}


