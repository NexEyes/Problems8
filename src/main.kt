
/*
Problem 8

fun main() {
    val firstUserEmailId = "user_one@gmail.com"
    val firstOperatingSystem = "Unknown OS"

    println(displayAlertMessage(firstOperatingSystem, firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}
fun displayAlertMessage(operatingSystem: String, emailID: String){

    println("There's a new sign-in request on $operatingSystem for your Google Account $emailID.")

}
*/
/*
Problem 8

fun main() {
    val steps = 4000
    val caloriesBurned = PEDOMETERstepsTOcalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = NumberOFStepS * caloriesBurnedForEachStep
    return totalCaloriesBurned
}
 */
/*

Problem 10
fun main() {
    val tdy = 3
    val tmr = 6
    val value = timeOnPhone(tdy,tmr)
    println("$value")
}

    fun timeOnPhone(timeSpentToday: Int,timeSpentYesterday: Int): Boolean {
        val comparison = timeSpentToday > timeSpentYesterday
        return comparison
    }
 */

fun main() {
    val guate = "Guatemala Ctiy"
    val cityA = "Amkara"
    val cityT = "Tokyo"
    val cityC = "Cape Town"

    val aHTemp = 32
    val tHTemp = 36
    val cHTemp = 64
    val gHTemp = 55

    val aLTemp = 27
    val tLTemp = 32
    val cLTemp = 59
    val gLTemp = 50

    val aCOR = 82
    val tCOR = 10
    val cCOR = 2
    val gCOR = 7

    weatherReport(cityA, aLTemp,aHTemp,aCOR)
    println()
    weatherReport(cityT, tLTemp,tHTemp,tCOR)
    println()
    weatherReport(cityC, cLTemp,cHTemp,cCOR)
    println()
    weatherReport(guate, gLTemp,gHTemp,gCOR)
    println()
}

    fun weatherReport(city: String,lowTemp: Int, highTemp: Int, cor: Int) {

        println("City: $city")
        println("Low Temprature: $lowTemp, High Temperature: $highTemp")
        println("Chance Of Rain : $cor%")

    }