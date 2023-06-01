var sortiment = mapOf<String, String>(
    "Banane" to "Obstabteilung, 2. Kiste",
    "Milch" to "Milchprodukte, linker Kühlschrank",
    "Schokolade" to "Süßwaren, 3. Regal, 2. Fach"
)

fun main(){
    var einkaufsListe = mutableListOf("Banane", "Milch", "Schokolade")

    // Variante 1:
    while (einkaufsListe.isNotEmpty()){
        var produkt = einkaufsListe.first()
        var regal = sortiment[produkt]
        println("Als nächstes kaufe ich $produkt. Ich finde es in $regal.")
        // Abbruch Bedingung
        einkaufsListe.removeFirst()
    }

}