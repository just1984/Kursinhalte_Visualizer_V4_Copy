
fun main(){

//    var test = 123.45.toString()
//    println(test)
//
//    println("Geben sie eine Zahl ein:")
//    var input = readln()
//
//    println(1 + input.toInt())

    println("Wieviel kostet ein Produkt?")
    var preis = readln().toDouble()
    println("15 produkte kosten: ${preis * 15}")

    // Pizza Rechner
    println("Geben sie Anzahl Pizza Stuecke an:")
    var pizzaStuecke: Int = readln().toInt()
    println("Geben sie Anzahl Freunde an:")
    var anzahlFreunde: Int = readln().toInt()
    var stueckeProPerson = pizzaStuecke / anzahlFreunde
    var uebrigeStuecke = pizzaStuecke % anzahlFreunde       // % = "Modulo"
    println("Bei $anzahlFreunde Freunden und $pizzaStuecke Stücke Pizza, bekommt jeder $stueckeProPerson")
    println("Es bleiben noch $uebrigeStuecke Stücke übrig")

}