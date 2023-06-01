
fun main(){

    // Hier legen wir die Temperaturen (gemessen von der Wetterstation aka Internet) als Variablen an.
    var tempNYC = 43
    var tempDenver = 33
    var tempLA = 52.5

    // Hier rufen wir die Umwandlungsfunktion auf
    tempNYC = fahrenheitToCelsius(tempNYC)
    tempDenver = fahrenheitToCelsius(tempDenver)
    tempLA = fahrenheitToCelsius(tempLA)

    // Hier drucken wir die umgewandelten Temperaturen aus
    println("Temperatur in NYC: $tempNYC°C")
    println("Temperatur in Denver: $tempDenver°C")
    println("Temperatur in LA: $tempLA°C")

    // Compiler erkennt automatisch welche Version wir benutzen wollen
    fahrenheitToCelsius(5.5)
    fahrenheitToCelsius()

    // Hier rufen wir unsere Funktion auf um größen umzuwandeln, und lassen uns die Ergebnisse anzeigen
    var groesse = imperialToMetric(5, 10)
    println("$groesse m")
    var eifelTurmHoehe = imperialToMetric(1024, 0)
    println("Der Eifelturm ist $eifelTurmHoehe m hoch.")
    var eifelTurmHoeheInklAntennen = imperialToMetric(1083, 0)
    println("Der Eifelturm (inkl. Antennen) ist $eifelTurmHoeheInklAntennen m hoch.")

}

fun fahrenheitToCelsius(){
    println("Geben sie jetzt die Temperatur in °F ein:")
    val F = readln().toInt()
    val C = (F-32) * 5 / 9
    println("Die Temperatur $F°F ist $C°C")
}

fun fahrenheitToCelsius(tempInF: Int): Int{
    /* Eine Funktion die uns eine Temperaturangabe in Grad Fahrenheit umwandelt zu Grad Celsius.
       Die Formel dafür ist:
        °C = [(°F-32)×5]/9
     */
    val tempInC = (tempInF-32) * 5 / 9
    return tempInC
}

fun fahrenheitToCelsius(tempInF: Double): Double{
    val tempInC = (tempInF-32) * 5 / 9
    return tempInC
}


fun imperialToMetric(feet: Int, inch: Int): Double{
    /*
        Eine Funktion die uns erlaubt eine Amerikanische Größenangabe umzuwandeln in Meter.
        Wir benutzen dabei diese Umrechnungen:
         1 foot = 12 Inches
         1 inch = 2.54 cm
     */
    val cm = (feet * 12 + inch) * 2.54
    val m = cm / 100
    return m
}
