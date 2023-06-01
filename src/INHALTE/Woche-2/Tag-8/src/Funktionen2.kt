
fun main(){
    var articles: MutableList<String> = mutableListOf("Twix", "Mars", "Kitkat", "Mars")
    val preisListe: MutableList<Double> = mutableListOf(1.25, 1.25, 1.50, 1.99)


    var neueArtikel = listOf("Bounty", "Milky Way")
    articles.addAll(neueArtikel)
    preisListe.addAll(listOf(1.25, 1.25))
//    preisListe.addAll(1.25, 1.25) // Elemente müssen in einer Kollektion sein


    val preisListe2 = preisListe
//    preisListe2.fill(0.99)
    println(preisListe2)


    var artikelVorschau = articles.slice(listOf(0, 3, 4))
    println(artikelVorschau)

    artikelVorschau = articles.slice(1..3)
    println(artikelVorschau)


//    println("Liste vor Remove All: $articles")
//    articles.removeAll(listOf("Mars", "Bounty"))
//    println("Liste nach Remove All: $articles")
//
//    println("Liste vor Retain All: $articles")
//    articles.retainAll(listOf("Mars", "Bounty"))
//    println("Liste nach Retain All: $articles")


    var test1 = articles.containsAll(listOf("Mars", "Twix"))
    println(test1)

    test1 = articles.containsAll(listOf("Mars", "Maoam"))
    println(test1)




    var kartenDeck = mutableListOf("Herz Ass", "Karo Ass", "Herz König", "Karo König")
    kartenDeck.shuffle()    // mischt das Kartendeck
    println(kartenDeck)

    val gemischtesDeck = kartenDeck.shuffled()   // gibt eine gemischte Kopie wieder



    articles.sort()    // sortiert die Liste
    preisListe.sort()
    println(articles)
    println(preisListe)
    articles.sortDescending()
    println(articles)

    var filmListe = listOf("Batman", "Aquaman","Wonderwoman", "Superman")
    val sortierteFilme = filmListe.sorted()   // gibt eine sortierte Kopie wieder
    println(sortierteFilme)
    filmListe = filmListe.sorted()


}