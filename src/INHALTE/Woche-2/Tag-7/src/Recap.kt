
fun main(){

    var leereListe: List<String> = listOf<String>()
    var primZahlen: List<Int> = listOf(2, 3, 5, 7, 11, 13)

    // 2. und 3. Primzahl zusammen:
    val ergebnis = primZahlen[1] + primZahlen[2]
    println("${primZahlen[1]} + ${primZahlen[2]} = $ergebnis")


    // Artikel und Preis Listen
    var articles: List<String> = listOf("Twix", "Mars", "Kitkat", "Haribo")
    var preisListe: List<Double> = listOf(1.25, 1.25, 1.50, 1.99)
    var anzahl: List<Int> = listOf(2, 5, 9, 10)

    // Zusammenhang von unseren Indices
    val indexVonKitkat: Int = 2
    preisListe[indexVonKitkat]
    anzahl[indexVonKitkat]

    // UNSER Süßigkeitautomat
    println("Wählen sie ein Produkt von 1-${articles.size}")
    var eingabe: Int = readln().toInt() - 1
    println("""
        Gewähltes Produkt: ${articles[eingabe]}
        Preis: ${preisListe[eingabe]}
        Anzahl verfügbar: ${anzahl[eingabe]}
    """.trimIndent())

    // Elemente an statische Liste anfügen
    articles + listOf("Bounty")


    val string1 = "Hallo,\n" +
            "wie gehts?\n" +
            "Ciao"
    val string2 = """
    Hallo,
    wie gehts?
    Ciao
    """.trimIndent()



    val zeichen1: Char = '1'

    println(string1)
    println(string2)

}