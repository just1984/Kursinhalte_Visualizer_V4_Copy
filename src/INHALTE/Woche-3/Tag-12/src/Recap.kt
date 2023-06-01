fun main(){

//    pikachuAttackenAuswahl()

    printGreeting()

    val testListe = listOf(1, 2, 3)
    println(testListe.random())

    kreisUmfang()
}


fun printGreeting(){
    println("Geben sie ihren Namen ein:")
    var name: String = readln()
    println("Hallo $name!")
}

fun kreisUmfang(){
    // 2 * r * pi
    val PI: Double = 3.14159
    println("Geben sie den Radius des Kreises ein: ")
    var radius = readln().toDouble()
    var umfang = 2 * radius * PI
//    println("Ein Kreis mit Radius $radius hat einen Umfang von $umfang")
}

fun pikachuAttackenAuswahl(){

    var gengarLP = 200

    // Pikachu ist das Pokemon des Spielenden
    // Spieler soll eine Attacke auswählen
    val pikachuAtks = mutableMapOf(
        "Donnerschock" to 40,
        "Ruckzuckhieb" to 40,
        "Donner" to 120
    )

    val atkNamen = pikachuAtks.keys
    println("Du hast diese Attacken zur Auswahl: $atkNamen")
    println("Geben sie ein:")
    println("1 für ${atkNamen.elementAt(0)}")
    println("2 für ${atkNamen.elementAt(1)}")
    println("3 für ${atkNamen.elementAt(2)}")

    val eingabe = readln()
    val index = eingabe.toInt() - 1
//    val i = readln().toInt() - 1

    val attacke = atkNamen.elementAt(index)
    val schaden: Int = pikachuAtks[attacke]!!
    println("Sie haben $attacke gewählt. Diese Attacke macht $schaden Schaden.")

    gengarLP -= schaden

}