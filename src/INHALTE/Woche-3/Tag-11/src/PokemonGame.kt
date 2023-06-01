var pikachuHP = 10000
val pikachuAtks = mutableMapOf(
    "Donnerschock" to 40,
    "Ruckzuckhieb" to 40,
    "Donner" to 120
)


var gengarHP = 10000
val gengarAtks = mutableMapOf<String, Int>(
    "Schattenklaue" to 90,
    "Finte" to 40,
    "Hypnose" to 0
)
fun main(){
    // Schattenklaue ist zu stark wir wollen den Wert verringern
    gengarAtks["Schattenklaue"]?.minus(10)



    pikachuAttackenAuswahl()
    println()
    Thread.sleep(500)
    gengarZufallsAttacke()


    pikachuAttackenAuswahl()
    println()
    Thread.sleep(500)
    gengarZufallsAttacke()


    pikachuAttackenAuswahl()
    println()
    Thread.sleep(500)
    gengarStaerksteAttacke()


    pikachuAttackenAuswahl()
    println()
    Thread.sleep(500)
    gengarZufallsAttacke()


    pikachuAttackenAuswahl()
    println()
    Thread.sleep(500)
    gengarZufallsAttacke()


}

fun pikachuAttackenAuswahl(){
    // Pikachu ist der Spieler
    // Spieler soll eine Attacke auswählen

    var atkNamen = pikachuAtks.keys
    println("Du hast diese Attacken zur Auswahl: $atkNamen")
    Thread.sleep(500)
    println("Geben sie ein:")
    println("0 für ${atkNamen.elementAt(0)}")
    println("1 für ${atkNamen.elementAt(1)}")
    println("2 für ${atkNamen.elementAt(2)}")

    var eingabe = readln()
    var index = eingabe.toInt()

    var attacke = atkNamen.elementAt(index)
    println("Sie haben $attacke gewählt.")
    println("Pikachu greift Gengar mit $attacke an")

    gengarHP -= pikachuAtks[attacke]!!
    println("Gegnar hat noch $gengarHP HP übrig.")
}

fun gengarZufallsAttacke(){
    // Gengar sucht eine Zufallsattacke aus
    var atkNamen = gengarAtks.keys
    var attacke = atkNamen.random()
    println("Gengar's zufalls Attacke ist: $attacke")
    pikachuHP -= gengarAtks[attacke]!!
    println("Pickachu hat noch $pikachuHP HP übrig.")
}

fun gengarStaerksteAttacke(){
    // Gengar's staerkste attack
    var schadenswerte = gengarAtks.values
    var atkNamen = gengarAtks.keys
    var index = schadenswerte.indexOf(schadenswerte.max())
    var attacke = atkNamen.elementAt(index)
    println("Gengar's stärkste Attacke ist: $attacke")
    pikachuHP -= gengarAtks[attacke]!!
    println("Gengar greift Pickachu mit $attacke an. ")
    Thread.sleep(1000)
    println("Pickachu hat noch $pikachuHP HP übrig.")
}