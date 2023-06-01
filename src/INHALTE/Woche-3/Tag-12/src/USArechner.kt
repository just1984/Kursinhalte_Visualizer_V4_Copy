
fun main(){
//    val C = fahrenheitToCelsius()
//    println("Die Temperatur ist $C °C")
    println(fahrenheitToCelsius() + 20)
}

fun fahrenheitToCelsius(): Int{
    // °C = [(°F-32)×5]/9
    println("Geben sie jetzt die Temperatur in °F ein:")
    val F = readln().toInt()
    val C = (F-32) * 5 / 9
//    println("Die Temperatur $F°F ist $C°C")
    return C
}

fun imperialToMetric(): Double{
    // 1 foot = 12 Inches
    // 1 inch = 2.54 cm

    println("Geben sie zuerst die Feet ein, bestätigen sie mit Enter, dann die Inches:")
    var feet = readln().toInt()
    var inch = readln().toInt()

    var cm = (feet * 12 + inch) * 2.54
    var m = cm / 100

    return m
}
