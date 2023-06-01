import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main() {

    /* TODO: Unser Ziel
          - zwei Zahlen von der Konsole einlesen
          - diese Addieren
          - Ergebnis anzeigen
     */

    // TODO: numberOne input
    println("ZAHL 1:")
    val zahl1Str: String = readln()
    var zahl1: Int

    // try-catch numberOne to Int
    try {
        zahl1 = zahl1Str.toInt()
    }
    catch (ex: Exception){
        println(ex)
        zahl1 = (-100..100).random()
        println("Zahl 1 wurde falsch eingegeben, deswegen benutzten wir eine Zufallszahl")
    }

    // TODO: numberTwo input
    println("ZAHL 2:")
    val zahl2Str: String = readln()
    var zahl2: Int

    // TODO: try-catch numberTwo toInt
    try {
        zahl2 = zahl2Str.toInt()
    }
    catch (ex: Exception){
        println(ex.message)
        println("Zahl 2 wurde falsch eingegeben, versuchen sie es nochmal")
        zahl2 = readln().toInt() // Vorsicht: hier könnten noch Fehler passieren
    }

    // Ergebnis Berechnen und Ausdrucken
    var result = zahl1 + zahl2
    println("$zahl1 + $zahl2 = $result")

    // BESSER:
    var term1 = readDouble()
    var term2 = readDouble()
    var ergebnis = term1 + term2
    println("$term1 + $term2 = $ergebnis")

    // Beispiel mit Text
    val text = "Der Nikolaus wohnt im Schokohaus"
    val wortIndex = 6
    try {
        println(text.split(' ')[wortIndex])
    } catch (ex: Exception){
        println(ex)
        println(ex.message)
    }
}


fun readInt(){
    // TODO: Sichere Funktion schreiben um Integer einzulesen

}

// Einlese Funktion für Komma Zahlen
fun readDouble(versuch: Int = 0): Double{
    if (versuch == 3){
        println("Sie haben die maximale Anzahl Versuche überschritten. Die Eingabe ist jetzt 0.0")
        return 0.0
    }

    // Beispiel Double Zahl einlesen
    println("Geben sie eine Kommazahl ein:")
    var eingabe = readln()

    // Kommas durch Punkte ersetzen
    eingabe = eingabe.replace(",", ".")

    var kommaZahl: Double
    try {
        kommaZahl = eingabe.toDouble()
        return kommaZahl
    } catch (ex: Exception){

        if (ex is NumberFormatException){
            println("Sie haben die Zahl im falschen Format eingegeben")
        }
        if (ex is NullPointerException)
            println("Sie haben gar keine Zahl eingegeben")

        println("Es gab einen Fehler, bitte versuchen sie es nochmal!")
        return readDouble(versuch+1)
    }
}