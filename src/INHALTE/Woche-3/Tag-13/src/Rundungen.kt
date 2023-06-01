import kotlin.math.round
import kotlin.math.pow

/*
   Die .pow() Funktion erlaubt uns die Potenz einer Zahl zu berechnen:
   Zur Erinnerung:
    Die Potenz ist eine Multiplikation einer Zahl mit sich selbst.
   7 ^ 2 = 7 * 7
   7 ^ 3 = 7 * 7 * 7

   Wir können die .pow() Funktion nur mit Double Werten benutzen, zB:
   7.0.pow(3)
   heißt 7 * 7 * 7
   */

fun main(){

    var zahl1 = 2.578361874648327680

    zahl1 = rundung(zahl1, 3)

    var zahl2 = rundung(1.587, 1)

    // manuell die Reihenfolge ändern
    var zahl3 = rundung(nachkommastellen=3, zahl = 1.5)


    // Fehler

    // falscher Datentyp von Argument für zahl
//    var zahl4 = rundung("2.34566", 2)

    // falscher Datentyp der Variable, weil der Rückgabewert "Double" ist
//    var zahl5: Int = rundung(2.345, 1)

    // falscher Name der Funktion
//    var zahl6 = Rundung(1.24, 1)

    // Fehlendes Argument für den Parameter 'Nachkommastellen'
//    var zahl7 = rundung(1.01123)
}


fun rundung(zahl: Double, nachkommastellen: Int = 2): Double {
    /*
        Hiermit implementieren wir endlich unsere Rundungsfunktion!
        Diese Rundungsfunktion basiert auf folgende Funktionsweise:
            1 Nachkommastelle: mal 10 rechnen, runden, geteilt durch 10     (faktor: 10)
            2 Nachkommastellen: mal 100 rechnen, runden, geteilt durch 100  (faktor: 10 * 10 = 100)
            3 Nachkommastellen: mal 1000, usw..                             (faktor: 10 * 10 * 10 = 1000)
        D.h die Anzahl der Nachkommastellen ist verbunden mit dem Faktor den wir benötigen.
        Der Faktor errechnet sich mit einer Potenz von 10 hoch der Anzahl der Nachkommastellen.

        Die Funktion benutzt 2 Parameter:
            - zahl: das ist die Zahl die wir runden möchten
            - nachkommastellen: das gibt an, auf wieviele Nachkommastellen möchten wir runden

        Als Rückgabewert gibt die Funktion die gerundete Zahl zurück.
     */

    val faktor = 10.0.pow(nachkommastellen)

    var gerundeteZahl = zahl * faktor
    gerundeteZahl = round(gerundeteZahl)
    gerundeteZahl /= faktor         // gerundeteZahl = gerundeteZahl / faktor

    return gerundeteZahl
}