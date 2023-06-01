
fun main(){

    val lieblingsFilme = listOf("Toy Story", "Findet Nemo", "Interstellar")
    val bewertungen = listOf(5.0, 7.5, 9.9)

    val hoechsteBewertung = bewertungen.max()
    val index = bewertungen.indexOf(hoechsteBewertung)
    var film = lieblingsFilme[index]

    println("Der Film '$film' hat die höchste Bewertung mit $hoechsteBewertung Sternen")

    // alles in aller Zeile
    film = lieblingsFilme[bewertungen.indexOf(bewertungen.max())]
    println(film)
}