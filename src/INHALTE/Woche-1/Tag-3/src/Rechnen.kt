
fun main(){

    40 + 50


    var spielerLP: Int = 40
    val heilung: Int = 50
    spielerLP += heilung        // kurz für: spielerLP = spielerLP + heilung

    val schaden: Int = 30
    spielerLP -= schaden        // kurz für: spielerLP = spielerLP - schaden

    val artikel1Preis: Double = 4.69
    val artikel2Preis: Double = 1.99
    var gesamtPreis: Double = (artikel1Preis + artikel2Preis) * 2
    println("$gesamtPreis")


    // Wenn ein Int und ein Double zusammen berechnet werden ist das Ergebnis immer ein Double!
    var test: Double = 4 + 1.0
    println("Test: $test")

    // String kann ich mit + aneinander hängen      "Konkatenation"
    var name: String = "Gordon" + "Lucas"
    println("Name: $name")


    // Kann ich andere Datentypen mixen
    //var test2 = 4 + "1.0"     // Int/Double + String geht nicht
    var test3 = "1.0" + 4.9 + true
    println("Test 3: $test3")
    //var test4 = false + false   // Booleans kann man nicht miteinander verrechnen
    //var test5 = 1 + false


    // Division und Rest (Modulo)

    // Aufpassen mit division durch 0
    //var test6 = 4 / 0
    //println("Test 6: $test6")

    // Pizza Rechner
    var pizzaStuecke: Int = 276
    var anzahlFreunde: Int = 43
    var anzahlLaktoseIntoleranterFreunde: Int = 3
    var stueckeProPerson = pizzaStuecke / (anzahlFreunde - anzahlLaktoseIntoleranterFreunde)
    var uebrigeStuecke = pizzaStuecke % (anzahlFreunde - anzahlLaktoseIntoleranterFreunde)       // % = "Modulo"
    println("Bei $anzahlFreunde Freunden und $pizzaStuecke Stücke Pizza, bekommt jeder $stueckeProPerson")
    println("Es bleiben noch $uebrigeStuecke Stücke übrig")


    var sekunden = 45
    sekunden = sekunden + 30
    println("Sekunden: $sekunden")
    sekunden = sekunden % 60
    println("Sekunden: $sekunden")

}