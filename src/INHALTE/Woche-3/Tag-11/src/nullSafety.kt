fun main() {
    beispielLaden()
}

fun basics(){
    var test: String? = null // ? bedeutet, dass die Variable null sein kann
    var liste = listOf<String>("A", "B", "C") // immutable Liste
    var a = liste[0] // bei einer Liste ist der Zugriff auf ein Element nie null
    var map = mapOf<String, Int>("eins" to 1, "zwei" to 2, "drei" to 3) // immutable Map
    var zahlOderNull : Int? = map["vier"] // bei einer Map kann der Zugriff auf ein Element null sein
    var zahl: Int = zahlOderNull!! // !! bedeutet, dass wir wissen, dass die Variable nicht null ist
    var zahl2: Int = zahlOderNull ?: 100 // ?: bedeutet, dass falls die Variable null ist, wir 100 nehmen
}

fun beispielLaden(){
    // Wir erstellen eine Map mit 3 Produkten und Preisen
    // Dann lassen wir den User ein Produkt auswählen
    // Es kann sein, dass das Produkt nicht existiert, dann ist der Preis null
    // Es gibt verschiedene Möglichkeiten, damit umzugehen:
    // 1. Wenn der Preis null ist, ziehen wir 0 vom Kontostand ab
    // 2. Wenn der Preis null ist, brechen wir das Programm ab
    // Code:

    val preisListe: MutableMap<String, Double> = mutableMapOf("Holz" to 10.0, "Stein" to 20.0, "Eisen" to 30.0)
    var kontostand = 100.0
    println("Ihr Kontostand beträgt $kontostand€.")
    println("Wählen sie ein Produkt. ")
    println("Zur Auswahl stehen:")
    println("Holz: ${preisListe["Holz"]}€")
    println("Stein: ${preisListe["Stein"]}€")
    println("Eisen: ${preisListe["Eisen"]}€")

    var artikel = readln() // z. B. "Holz" oder "Gold"

    var preis: Double? = preisListe[artikel]// z. B. 10.0 oder null
    println("Produkt $artikel ausgewählt zum Preis $preis")

    //Option 1: wenn das Produkt nicht existiert, ziehe 0 ab und lauf weiter
    kontostand -= preis ?: 0.0
    //Option 2: wenn das Produkt nicht existiert, breche das Programm ab:
    kontostand -= preis!!



    println("neuer Kontostand: $kontostand")
}