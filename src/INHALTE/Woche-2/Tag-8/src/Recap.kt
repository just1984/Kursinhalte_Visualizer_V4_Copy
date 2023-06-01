

fun main(){

    // Strings verändern
    var vorname = "Gordon"
    vorname = vorname.lowercase()
    vorname = vorname.uppercase()

    // First und Last geben einen Fehler bei leeren Listen
    val articles = mutableListOf<String>()
//    println(articles.first())
//    println(articles.last())

    var pizzas = mutableListOf("Margarita", "Tonno", "Tonno & Zwiebel", "Salame", "Tonno & Zwiebel", "Tonno & Zwiebel")

    pizzas.remove("Tonno")

    var anzahl = pizzas.count { it == "Tonno" }
    println(anzahl)

    anzahl = pizzas.count{it.contains("Tonno") }
    println(anzahl)

    val gefilterteListe = pizzas.filter { it.contains("Tonno") }
    println(gefilterteListe)
}