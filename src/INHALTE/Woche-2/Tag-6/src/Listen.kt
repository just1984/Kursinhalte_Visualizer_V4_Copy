

fun main(){

    // Bei einer leeren Liste muss ich den Datentyp angeben
    var leereZahlenListe: List<Double> = listOf()

    // Bei einer Liste mit Initialwerten, versteht Kotlin automatisch den Datentyp
    var kommaZahlenListe = listOf(1.0, 2.0, 1.5)

    var ziffern: List<Int> = (1..100).toList()
    println(ziffern)

    var artikelListe: List<String> = listOf("Pizza", "Cola", "Eiscreme")
    val preisListe: List<Double> = listOf(1.99, 0.44, 0.99)

    println("Geben sie eine Zahl von 0-${artikelListe.size-1} an")
    val index = readln().toInt()
    println("Der Artikel ${artikelListe[index]} kostet ${preisListe[index]}")


    // Unterschied zw Konstante und Variable
    artikelListe = listOf("Reis", "Spinat", "Eier", "Pizza", "Cola")
    // preisListe = listOf(1.0)    // Konstante kann ich nicht verändern


    println(artikelListe.size) // Indices in kotlin immer von: 0 bis size-1

    val test = kommaZahlenListe[0] * 2.0

    println("Der erste Artikel ist: ${artikelListe[0]}")
    println("Der zweite Artikel ist: ${artikelListe[1]}")
    println("Der dritte Artikel ist: ${artikelListe[2]}")

//    println("Der vierte Artikel ist: ${artikelListe[-1]}")    // Index Out of Bounds exception

    println(artikelListe.indices)


}