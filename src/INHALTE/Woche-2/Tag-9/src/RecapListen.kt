
fun main(){

    val mitarbeiter = listOf(
        "Niclas",
        "Marvin",
        "Till",
        "Anna",
        "Marianne",
        "Felix",
        "Cora",
        "Michelle",
        "Kevin"
    )
    val mitarbeiterAlter = listOf(26, 29, 31, 24, 30, 38, 29, 25, 32)

    val inventar = mutableListOf(
        "Heiltrank",
        "Feder",
        "Schwert",
        "Heiltrank",
        "Heiltrank",
        "Feder",
        "Feder",
        "Dolch",
        "Perle",
        "Perle"
    )

    println("""Alle MitarbeiterInnen:
        $mitarbeiter""".trimMargin())

    // Zahl einlesen
//    println("Welchen Mitarbeiter wollen sie einsehen?")
//    println("Geben sie eine Zahl zw. 1 und ${mitarbeiter.size} ein")
//    var input: String = readln()
//    var index: Int = input.toInt() - 1
//    //var index: Int = readln().toInt()
//
//    // Namen in Personliste ausgeben
//    var name = mitarbeiter[index]
//    var alter = mitarbeiterAlter[index]
//    println("$name ist $alter Jahre alt")

    // 2 Zahlen einlesen
    println("Welche Mitarbeiter wollen sie einsehen?")
    println("Geben sie zuerst eine Zahl zw. 1 und ${mitarbeiter.size} ein")
    var input = readln()
    var index1: Int = input.toInt() - 1

    println("Geben sie jetzt wieder eine Zahl zw. ${index1+1} und ${mitarbeiter.size} ein")
    input = readln()
    var index2: Int = input.toInt() - 1

    // mit Slice arbeiten

    var mitarbeiterTeilListe = mitarbeiter.slice(index1 .. index2)
    var altersTeilliste = mitarbeiterAlter.slice(index1..index2)
    println(mitarbeiterTeilListe)
    println(altersTeilliste)


    // Umgehen, dass 2. Zahl größer sein muss
    var indices = mutableListOf(index1, index2)
    indices.sort()
    index1 = indices.first()
    index2 = indices.last()




    // versch. Datentypen
    var beispiel: List<Any> = listOf<Any>(1, 1.9, "Hallo", true)

}