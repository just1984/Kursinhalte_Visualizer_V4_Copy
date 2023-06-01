
fun main(){

    // Beispiel 1: Zählen wie oft ein Wort im Text vorkommt
    val suchWort = "Und"

    val text = "Manchmal geschieht es in tiefer Nacht, " +
            "Daß der Wind wie ein Kind erwacht, " +
            "Und er kommt die Allee allein " +
            "Leise, leise ins Dorf herein. " +
            "Und er tastet bis an den Teich, " +
            "Und dann horcht er herum: " +
            "Und die Häuser sind alle bleich, " +
            "Und die Eichen sind stumm … " +
            "\n"
    val wortListe = text.split(' ').toMutableList()
    if (suchWort in wortListe) {
        wortListe.retainAll(listOf(suchWort))
        println("Das Wort ist ${wortListe.size} mal im text")
    }


    // Beispiel 2: NamensListe:
    val namensListe: List<String> = listOf("Stephan", "Merlin", "Hannes", "Emily", "Nico", "Benni", "Brian")
    val notenListe: List<Int> = listOf(1, 2, 3, 4, 1, 2, 3)

    val gesuchterName = "Jakob"
    if (gesuchterName in namensListe) {
        val index = namensListe.indexOf(gesuchterName)
        val note = notenListe[index]
        println("$gesuchterName hat eine $note")
    } else {
        println("$gesuchterName existiert nicht in der Notenliste")
    }


    // Beispiel 3: Sortiment (map)
    val sortiment = mutableMapOf(
        "Apfel" to 0.49,
        "Banane" to 0.39,
        "Kiwi" to 0.19,
        "Breze" to 0.75
    )

    // Wir wollen ein neues Produkt hinzufügen
    val neuerProduktName = readln()
    val neuerPreis = readln().toDouble()

    // Falls das Produkt bereits im Sortiment ist, wollen wir den Preis aktualisieren
    if (neuerProduktName in sortiment) {    // sortiment.keys
        println("Das Produkt existiert bereits")
        if (sortiment[neuerProduktName] != neuerPreis) {
            sortiment[neuerProduktName] = neuerPreis
            println("Der Preis wurde aktualisiert.")
        }
    } else {        // andernfalls fügen wir ein neues Produkt hinzu
        sortiment[neuerProduktName] = neuerPreis
        println("Das neue Produkt $neuerProduktName wurde angelegt.")
    }

    // Ist ein bestimmter value im Sortiment?
    if (0.99 in sortiment.values) {
        println("Es gibt ein Produkt, das 99cent kostet.")
    }

    // Ist ein bestimmtes Produkt im Einkaufswagen?
    val einkaufswagen = mutableListOf("Breze", "Breze", "Banane")
    if ("Apfel" in einkaufswagen || "Banane" in einkaufswagen) {
        println("Weil du gesund einkaufst sparst du dir die Steuer")
    }

}



// TODO für Donnerstag
fun countWordInText(wort: String, text: String): Int{
    var count = 0
    if (wort in text){
        var wortListe = text.split(" ")
        count = wortListe.count { it == wort }
    }
    return count
}

/*
// Beispiel 1: Telefonnummer
    val telefonNummer: String = "+4912312312"  // -> "+4923232"
    val testZiffer = '1'
    if (testZiffer in telefonNummer) {  // == telefonNummer.contains(testZiffer)
        var count = telefonNummer.count { ziffer -> ziffer == testZiffer }
        println("In meiner Telefonnummer kommt die '$testZiffer' $count mal vor.")
    } else {
        println("In meiner kommt die $testZiffer nicht vor.")
    }
 */