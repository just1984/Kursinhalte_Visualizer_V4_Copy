fun main(){

    /*var name = "Gordon"
    name = "Michi"

    val vorname = "Gordon"
    vorname = "Tobi"*/

    var name1 = "Gordon"
    var name2 = "Johann"

    val namensListe = mutableListOf(name1, name2)
    name1 = "Andreas"



    var primZahlen: MutableList<Int> = mutableListOf(2, 3, 5, 7, 11, 13)
    var articles: MutableList<String> = mutableListOf("Twix", "Mars", "Kitkat", "Mars")
    val preisListe: MutableList<Double> = mutableListOf(1.25, 1.25, 1.50, 1.99)

    // Wert ändern
    preisListe[0] = 1.00
    // preisListe = mutableListOf() // Konstante kann ich nicht neu zuweisen

    articles.add("Bounty")
    preisListe.add(1.25)
    articles.add(0, "Maoam")
    preisListe.add(0, 2.00)

    articles.remove("Mars")
    // Das Ergebnis der remove Funktion ist ein Boolean,
    //      der beschreibt, ob etwas entfernt wurde oder nicht
    var erfolg: Boolean = articles.remove("Kitkat")
    preisListe.remove(1.25)
    // Das Ergebnis der removeAt Funktion ist das gelöschte Element
    var geloeschteElement: String = articles.removeAt(0)


    println(primZahlen.min())
    println(primZahlen.max())

    // billigstes produkt kaufen
    val billigsterPreis = preisListe.min()
    val indexVonBilligsterPreis = preisListe.indexOf(billigsterPreis)

    println("${articles[indexVonBilligsterPreis]} : ${preisListe[indexVonBilligsterPreis]}")

    articles = mutableListOf("Twix", "Mars", "Kitkat", "Haribo", "Mars")

    val indexVonMars = articles.indexOf("Mars")
    val letzterIndexVonMars = articles.lastIndexOf("Mars")

    println(indexVonMars)
    println(letzterIndexVonMars)

    // Wenn er das Produkt nicht findet, bekommen wir den Index -1
    val indexVonSnickers = articles.indexOf("Snickers")
    println("Index von Snickers: $indexVonSnickers")


}