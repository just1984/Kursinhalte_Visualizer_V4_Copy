
fun main(){

    // Key: Ja/nein Eingabe, Value: Boolean
    val antworten: Map<String, Boolean> = mapOf(
        "Ja" to true,
        "ja" to true,
        "yes" to true,
        "true" to true,
        "Nein" to false,
        "nein" to false,
        "no" to false,
        "false" to false
    )

    // Key: Person, Value: Liste von Haustieren
    val hausTiere: Map<String, MutableList<String>> = mapOf(
        "Gordon" to mutableListOf(),
        "Christian W." to mutableListOf("Hund"),
        "Johann" to mutableListOf("Hund", "Hund", "Kaninchen", "Kaninchen","Kaninchen"),
        "Sergej" to mutableListOf("Katze","Katze","Katze","Katze","Katze","Katze")
    )

    // Key: Person, Value: Map aus Einträgen (zB "Handynummer","Adresse", "Email", etc)
    val telefonBuch: MutableMap<String, MutableMap<String, String>> = mutableMapOf(
        "Gordon" to mutableMapOf(
            "Handynummer" to "+49 1236767214",
            "Adresse" to "Teststraße 123, 12345 Berlin",
            "Email" to "gordon.lucas@syntax-institut.de"
        ),
        "Jana" to mutableMapOf(
            "Handynummer" to "",
            "Email" to "jana@syntax.de"
        )

    )

    // Key: Artikel, Value: Preis
    val sortiment: MutableMap<String, Double> = mutableMapOf(
        "Mars" to 1.25,
        "Twix" to 1.25,
        "Kitkat" to 1.50,
        "Haribo" to 1.99,
        "Coca Cola 0.33l" to 2.50,
        "Coca Cola Zero 0.33" to 2.50,
        "Club Mate 0.33l" to 2.50
    )

    // Key: Item, Value: Anzahl
    val inventar: MutableMap<String, Int> = mutableMapOf(
        "Heiltrank" to 3,
        "Schwert" to 1,
        "Dolch" to 2,
        "Feder" to 9
    )

    // Werte abfragen:
    println("Wählen sie ein Produkt. ")
    println("Zur Auswahl stehen: \n ${sortiment.keys}")
    val artikel = readln()  // zB "Mars"
    val preis: Double? = sortiment[artikel]
    println("Ein $artikel kostet $preis")

    var guthaben: Double = 5.0
    guthaben -= preis!!
    println("Rückgeld: $guthaben")

    // Viele Mapfunktionen funktionieren auch mit Maps
    sortiment.contains(artikel)

    // Wert in der Map anpassen
    inventar["Heiltrank"] = inventar["Heiltrank"]!! - 1
    hausTiere["Gordon"]!!.add("Katze")
    hausTiere["Johann"]!!.remove("Kaninchen")

    // Neues Paar erstellen
    inventar["Manatrank"] = 1
    sortiment["Snickers"] = 1.25
    sortiment["Kitkat"] = 2.0   // Altes Paar wird komplett überschrieben

    // Schlüssel verändern
    sortiment["Kitkat White"] = 2.0
    sortiment.remove("Kitkat")      // entfernt das gesamte Paar

    // Paare löschen
    inventar.remove("Manatrank")
    inventar.remove("Manatrank", 2)

}