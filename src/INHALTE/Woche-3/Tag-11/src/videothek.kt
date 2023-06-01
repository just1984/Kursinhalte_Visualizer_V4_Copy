


// Aufgabe 1: Sortiment erstellen
var filmListe = mutableListOf("Spiderman", "Ironman", "Wonderwoman")
var preisListe = mutableListOf(9.99, 4.99, 9.99)

fun main(){

    // Aufgabe 2: Kunden begrüßen und Sortiment anzeigen
   begruessungUndSortiment()


    // Aufgabe 3:
    //      - Günstigsten Film anzeigen
//    sonderAngebotAnzeigen()

    var minPreis = preisListe.min()
    var index1 = preisListe.indexOf(minPreis)
    var minFilm = filmListe[index1]
    println("Heute haben wir \"$minFilm\" im Angebot für $minPreis€")




    //      - Film aussuchen lassen
    println("Wählen sie jetzt ihren Film (1-3):")
    var input: String = readln()
    var index = input.toInt() - 1
    //      - Bestätigung ausgeben
    var film = filmListe[index]
    var preis = preisListe[index]

    println("Sie haben \"$film\" für $preis€ gewählt.")

    // Aufgabe 4:
    //      - Kundenkonto aktualisieren
    var konto1 = 50.00
    konto1 -= preis  // konto1 = konto1 - preis

    //      - Film aus Sortiment nehmen
//    filmListe.remove(film)
//    preisListe.remove(preis)
    filmListe.removeAt(index)
    preisListe.removeAt(index)
    println()

    // Aufgabe 5: 2. Kunde
    //      - Batman zum Sortiment hinzufügen
    filmListe.add("Batman")
    preisListe.add(19.99)

    //      - Begrüßung
    //      - Sortiment anzeigen
    begruessungUndSortiment()


    //      - Auswahl einlesen
    println("Wählen sie jetzt ihren Film (1-3):")
    input = readln()
    index = input.toInt() - 1
    film = filmListe[index]
    preis = preisListe[index]
    //      - Bestätigung
    println("Sie haben \"$film\" für $preis€ gewählt.")
    //      - kundenkonto aktualisieren
    var konto2 = 50.00
    konto2 -= preis
    //      - Film aus Sortiment nehmen
    filmListe.removeAt(index)
    preisListe.removeAt(index)

    // Aufgabe 6: System überarbeiten als Map
    var filmMap = mutableMapOf<String, Double>(
        "Spiderman" to 9.99,
        "Ironman" to 9.99,
        "Wonderwoman" to 4.99,
        "Batman" to 19.99
    )

    // fehlerhaft
//    var filmMap2 = mapOf<Double, String>(
//        9.99 to "Spiderman",
//        9.99 to "Ironman"
//    )



    // Aufgabe 7:
    //      - Abfrage, ob ein Film im Sortiment ist

    var gesuchterFilm = "Aquaman"
    var filmImSortiment: Boolean = filmListe.contains(gesuchterFilm)
    filmImSortiment = filmMap.contains(gesuchterFilm)

    //      - und Preis anzeigen
    var preisFallsVorhanden = filmMap[gesuchterFilm]
    println("Ist $gesuchterFilm im Sortiment? $filmImSortiment für $preisFallsVorhanden€")

    //      - Kunden behandeln
    var konto3 = 50.00


    filmListe = filmMap.keys.toMutableList()
    preisListe = filmMap.values.toMutableList()

    begruessungUndSortiment()


    println("Wählen sie jetzt ihren Film (1-4):")
    input = readln()
    index = input.toInt() - 1
    film = filmListe[index]
    preis = preisListe[index]

    preis = filmMap[film]!!

    println("Sie haben \"$film\" für $preis€ gewählt.")
    konto3 -= preis
    filmMap.remove(film)
//    filmMap.remove(film, preis)

    // Aufgabe 8: Alle Filmnamen und alle Preise anzeigen
    println(filmMap.keys)
    println(filmMap.values)


    // Liste aus Paaren erstellen
    var filmeMitPreisen: List<Pair<String, Double>> = listOf(
        Pair("Ironman", 2.99),
        Pair("Aquaman", 3.99)
    )


}

fun begruessungUndSortiment(){

    println("Geben ihren Usernamen ein:")
    var username = readln()

    println("Hallo, $username")
    println("Wir haben diese Filme im Angebot:")

    var begruessung: String = """
        1: ${filmListe[0]}: ${preisListe[0]}
        2: ${filmListe[1]}: ${preisListe[1]}
        3: ${filmListe[2]}: ${preisListe[2]}
        4: ${filmListe[3]}: ${preisListe[3]}
    """.trimIndent()

    println(begruessung)
}

fun sonderAngebotAnzeigen(){

}

fun kundenFilmWahl(){


}