import kotlin.math.PI

// Globale Variablen
val WECHSELKURS = 0.92
var kasse = mutableMapOf(
    "50.0" to 4,
    "10.0" to 10
)

fun main() {


    println("Geben sie den aktuellen Wechselkurs € to $ ein:")
    var wechselKurs = readln().toDouble()

    var isRaining = false
    var isSunny = true

    if (isSunny)
        println("Es ist sonnig")

    if (isRaining) {
        println("Es regnet")
        println("Regenjacke einpacken")
    }

    if (isSunny)
        if (isRaining)
            println("Regenbogen")

}

fun euroToDollar(euroBetrag: Double, wechselKurs: Double): Double{
    var dollarBetrag = euroBetrag * wechselKurs
    return dollarBetrag
}