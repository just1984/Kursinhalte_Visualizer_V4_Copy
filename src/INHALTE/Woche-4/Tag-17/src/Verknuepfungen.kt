fun getRandomBoolean(): Boolean{
    return listOf(true, false).random()
}

fun main() {

    var autoMarke = "VW"
    var autoAlter = 4
    var ps = 120
    var autoFarbe = "grün"
    var preis = 10000.00


    if (preis < 20000.0 && autoFarbe == "blau" && ps >= 100 && (autoMarke == "VW" || autoMarke == "Audi")){
        println("Auto Probefahren")
    }
    else {
        println("dieses Auto interessiert mich nicht")
    }



    val isSunny: Boolean = getRandomBoolean()
    val isRaining: Boolean = getRandomBoolean()
    val isWindy: Boolean = getRandomBoolean()
    val isDay: Boolean = getRandomBoolean()

    val temperature = getRandomTemperature() //zw. -5 und 30 Grad Celcius

    // TODO: NOT
    // Cloudy
    val isCloudy: Boolean = !isSunny

    // Warm Outside
    val isWarm = temperature > 20  // !(temperature < 20)

    // Night
    val isNight = !isDay


    // TODO: AND
    // Rainbow
    if (isRaining && isSunny)
        println("Wir sehen heute einen Regenbogen")

    // Snow
    val isSnowing: Boolean = isRaining && (temperature < 4)
    if (isSnowing)
        println("Es schneit")

    // Sunscreen
    if (isSunny && temperature > 25){
        println("Heute sollte ich besser eincremen")
    }

    // TODO: OR
    // Jacket
    if (isWindy || isRaining || temperature < 10)
        println("Heute sollte ich eine Jacke anziehen")


    // Und & Oder im selben Satz
    if (isCloudy && (isWindy || isRaining) || temperature > 10){
        println()
    }

}


fun getRandomTemperature(): Int{
    return (-5..30).random()
}