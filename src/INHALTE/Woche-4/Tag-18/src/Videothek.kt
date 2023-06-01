val sortiment = mutableMapOf(
    "Batman" to 9.99,
    "Superman" to 5.99,
    "Aquaman" to 7.99,
    "Wonderwoman" to 7.99,
    "Poison Ivy" to 5.99,
    "Don't look up" to 10.99,
    "Interstellar" to 10.99,
    "Micky Mouse I" to 4.99,
    "Micky Mouse II" to 5.99
)

fun main() {

    println("Wir haben diese Filme im Angebot: \n ${sortiment.keys}")

    var eingabe = indexEingabe(minIndex = 1, maxIndex = sortiment.size) - 1

    var filmAuswahl: String = sortiment.keys.elementAt(eingabe)
    var filmPreis: Double = sortiment[filmAuswahl]!!

    println("Sie haben den Film $filmAuswahl gewählt.\n Preis: $filmPreis")

}

fun indexEingabe(minIndex: Int, maxIndex: Int): Int {
    println("Wählen sie einen Film: $minIndex-$maxIndex")

    var eingabe = readln()

    // Wenn die Eingabe ein Filmname ist:
    if (eingabe in sortiment) {
        return sortiment.keys.indexOf(eingabe) + 1
    }

    try {
        var index = eingabe.toInt()

        if (index in minIndex..maxIndex)
            return index
        else {
            println("Die eingegebene Zahl war nicht zwischen $minIndex und $maxIndex")
            return indexEingabe(minIndex, maxIndex)
        }
    } catch (e: Exception) {
        println("Sie haben die Zahl falsch eingegeben")
        return indexEingabe(minIndex, maxIndex)
    }


}