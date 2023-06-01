import kotlin.math.round

fun main(){

    var dollar: Double  = 50.0
    var euro = dollarToEuro(dollar)
    euro = dollarToEuro(dollar, 0.90)

    wechselgeldRechner(23.57, 50.0)
}


fun wechselgeldRechner(betrag: Double, barzahlung: Double): Double{
    /* Diese Funktion berechnet Wechselgeld.
        Der Parameter "betrag" beschreibt den Preis der Rechnung.
        Der Parameter "barzahlung" beschreibt mit wieviel Geld bezahlt wurde.

        Die Funktion druckt auf der Konsole aus, mit welchen Scheinen und Münzen das Rückgeld bezahlt werden kann.

        Als Rückgabewert wird zurückgegeben, wie viel Geld man zurückbekommt.
     */

    val rueckgeld = barzahlung - betrag

    var rueckgeldVar = rueckgeld

    val anzahlFuenfizger = rueckgeldVar.toInt() / 50
    rueckgeldVar -= (anzahlFuenfizger * 50.0)

    val anzahlZwanziger = rueckgeldVar.toInt() / 20
    rueckgeldVar -= (anzahlZwanziger * 20.0)

    val anzahlZehner = rueckgeldVar.toInt() / 10
    rueckgeldVar -= (anzahlZehner * 10.0)

    val anzahlFuenfer = rueckgeldVar.toInt() / 5
    rueckgeldVar -= (anzahlFuenfer * 5.0)

    val anzahlZweier = rueckgeldVar.toInt() / 2
    rueckgeldVar -= (anzahlZweier * 2.0)

    val anzahlEinser = rueckgeldVar.toInt() / 1
    rueckgeldVar -= (anzahlEinser * 1.0)

    
    // ab hier rechnen wir in Cent, deswegen mal 100
    rueckgeldVar *= 100
    
    val anzahlFuenfzigCent = rueckgeldVar.toInt() / 50
    rueckgeldVar -= (anzahlFuenfzigCent * 50)

    val anzahlZwanzigCent = rueckgeldVar.toInt() / 20
    rueckgeldVar -= (anzahlZwanzigCent * 20)

    val anzahlZehnCent = rueckgeldVar.toInt() / 10
    rueckgeldVar -= (anzahlZehnCent * 10)

    val anzahlFuenfCent = rueckgeldVar.toInt() / 5
    rueckgeldVar -= (anzahlFuenfCent * 5)

    val anzahlZweiCent = rueckgeldVar.toInt() / 2
    rueckgeldVar -= (anzahlZweiCent * 2)

    rueckgeldVar = round(rueckgeldVar)
    val anzahlEinCent = rueckgeldVar.toInt()
    rueckgeldVar -= (anzahlEinCent * 1)

    println("""
        Rückgeld: $rueckgeld
        
        50er: $anzahlFuenfizger
        20er: $anzahlZwanziger
        10er: $anzahlZehner
        5er: $anzahlFuenfer
        2er: $anzahlZweier
        1er: $anzahlEinser
        50 cent: $anzahlFuenfzigCent
        20 cent: $anzahlZwanzigCent
        10 cent: $anzahlZehnCent
        5 cent: $anzahlFuenfCent
        2 cent: $anzahlZweiCent
        1 cent: $anzahlEinCent
        
    """.trimIndent())

    return rueckgeld
}


fun dollarToEuro(dollar: Double, wechselkurs: Double = 0.92): Double{
    /* Eine Funktion die den gegebenen Dollar Betrag umrechnet in Euro.
        Der default Wechselkurs wurde am 30.3.2023 festgelegt
     */
    val euro = dollar * wechselkurs
    return euro
}