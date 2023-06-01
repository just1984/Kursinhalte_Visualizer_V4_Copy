fun main() {

    var videothek = mutableMapOf<String, Double>(
        "Shrek" to 5.99,
        "Toy Story" to 10.99,
        "Batman" to 11.99
    )

    var videothekGenre = mutableMapOf(
        "Shrek" to "Animation",
        "Toy Story" to "Horror"
    )

    var namensListe = mutableListOf(
        "Gordon", "Bob", "Batman","Eduard", "Arkadius", "Mariusz", "Blechi","Soheil"
    )

    println(namensListe)

    var gefilterteNamensListe = namensListe.filter { it -> it.startsWith("B") }
    println(gefilterteNamensListe)

    gefilterteNamensListe = namensListe.filter { name -> name.length > 7 }
    println(gefilterteNamensListe)



    println(videothek.toSortedMap())

    // Filter die Filme anhand von Preis
    var filteredVideothek = videothek.filter { film -> film.value > 10.00 }
    println(filteredVideothek)


    // Filter die Filme anhand vom Startbuchstaben
    filteredVideothek = videothek.filter { it -> it.key.startsWith('B', true) }
    println(filteredVideothek)


    println(videothek)
}