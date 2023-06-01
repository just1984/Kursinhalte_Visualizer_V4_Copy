
var kartenDeck = neuesDeck()

fun main(){
    // TODO 1: Kartendeck erstellen
    var kartenStapel: MutableList<String> = neuesDeck()

    // TODO 2: Kartendeck mischen
    kartenMischen(kartenStapel)

    // Gemischtes Deck einmal anzeigen:
    println("Gemischter Stapel: \n$kartenStapel\n")

    // TODO 3: Karte ziehen
    var meineKarte = karteZiehen(kartenStapel)
    println("Meine gezogene Karte: $meineKarte")
    println("Deck nachdem ich gezogen hatte: \n$kartenStapel\n")

    // TODO 4: Hand ziehen
    var handSpieler1 = handZiehen(kartenStapel)
    var handSpieler2 = handZiehen(kartenStapel)
    println("Hand 1: $handSpieler1")
    println("Hand 2: $handSpieler2")


    // TODO 5: Karten zählen
    println("Anzahl Karten im Stapel: ${uebrigeKarten(kartenStapel)}")

    // TODO 7: Karten Punkte zuweisen
    handPunkte(kartenStapel)
}

// TODO 1: Kartendeck erstellen
fun neuesDeck(): MutableList<String>{
    var deck = mutableListOf(
        "Rot Ass", "Rot König", "Rot Dame", "Rot Prinz", "Rot 10", "Rot 9", "Rot 8", "Rot 7",
        "Schwarz Ass", "Schwarz König", "Schwarz Dame", "Schwarz Prinz", "Schwarz 10", "Schwarz 9", "Schwarz 8", "Schwarz 7"
    )
    return deck
}


// TODO 2: Kartendeck mischen
fun kartenMischen(karten: MutableList<String>){
    karten.shuffle()
}

fun kartenMischen(karten: List<String>): List<String>{
    return karten.shuffled()
}

// TODO 3: Karte ziehen
fun karteZiehen(stapel: MutableList<String>): String {
//    val karte = stapel.first()
//    stapel.remove(karte)
//    return karte
    return stapel.removeFirst()
}

// TODO 4: Hand ziehen
fun handZiehen(stapel: MutableList<String>): MutableList<String>{
    val hand = mutableListOf<String>()

    // 5x 1 Karte
    hand.add(karteZiehen(stapel))
    hand.add(karteZiehen(stapel))
    hand.add(karteZiehen(stapel))
    hand.add(karteZiehen(stapel))
    hand.add(karteZiehen(stapel))

    return hand
}

fun kartenZiehen(stapel: MutableList<String>, nrKarten: Int = 5){
    // 5 auf einmal
    val hand = mutableListOf<String>()
    val gezogeneKarten = stapel.slice(0..nrKarten-1)
    hand.addAll(gezogeneKarten)
    stapel.removeAll(gezogeneKarten)
}

// TODO 5: Karten Zählen
fun uebrigeKarten(stapel: MutableList<String>): Int{
    return stapel.size
}

// TODO 7: Karten Punkte zuweisen einer Farbe zählen
val kartenPunkte: Map<String, Int> = mapOf(
    "Rot Ass" to 11,
    "Rot König" to 4, 
    "Rot Dame" to 3,
    "Rot Prinz" to 2, 
    "Rot 10" to 10, 
    "Rot 9" to 0, 
    "Rot 8" to 0, 
    "Rot 7" to 0,
    "Schwarz Ass" to 11,
    "Schwarz König" to 4,
    "Schwarz Dame" to 3,
    "Schwarz Prinz" to 2,
    "Schwarz 10" to 10,
    "Schwarz 9" to 0,
    "Schwarz 8" to 0,
    "Schwarz 7" to 0
)


fun handPunkte(stapel: MutableList<String>): Int{
    val hand = mutableListOf<String>()
    var handPunkte = 0

    // 1. Karte
    var karte = karteZiehen(stapel)
    hand.add(karte)
    handPunkte += kartenPunkte[karte]!!

    // 2. Karte
    karte = karteZiehen(stapel)
    hand.add(karte)
    handPunkte += kartenPunkte[karte]!!

    // 3. Karte
    karte = karteZiehen(stapel)
    hand.add(karte)
    handPunkte += kartenPunkte[karte]!!

    // 4. Karte
    karte = karteZiehen(stapel)
    hand.add(karte)
    handPunkte += kartenPunkte[karte]!!

    // 5. Karte
    karte = karteZiehen(stapel)
    hand.add(karte)
    handPunkte += kartenPunkte[karte]!!

    return handPunkte
}

fun handPunkteV2(hand: MutableList<String>): Int {
    var handPunkte = 0

    var karte = hand[0]
    handPunkte += kartenPunkte[karte]!!

    karte = hand[1]
    handPunkte += kartenPunkte[karte]!!

    karte = hand[2]
    handPunkte += kartenPunkte[karte]!!

    karte = hand[3]
    handPunkte += kartenPunkte[karte]!!

    karte = hand[4]
    handPunkte += kartenPunkte[karte]!!

    return handPunkte
}

// Bonus
fun bonusSpiel(){
    var deck = neuesDeck()
    kartenMischen(deck)

    var handSpieler1 = handZiehen(deck)
    var handSpieler2 = handZiehen(deck)

    // Hand und Punkte ausgeben
    println("Spieler 1 hat ${handPunkteV2(handSpieler1)} Punkte")
    println("Hand Spieler 1: $handSpieler1\n")

    println("wählen sie eine Karte, die sie ablegen möchten: (1-5)")
    var eingabe = readln().toInt()
    handSpieler1.removeAt(eingabe-1)    // Wirft die gewählte Karte ab
    var karte = karteZiehen(deck)             // Zieht eine neue Karte
    handSpieler1.add(karte)                        // Fügt die neue Karte zur Hand hinzu
    println("Ihr neu gezogene Karte ist: $karte")
    println("Finale Punktzahl: ${handPunkteV2(handSpieler1)}\n")



    println("Spieler 2 hat ${handPunkteV2(handSpieler2)} Punkte")
    println("Hand Spieler 2: $handSpieler2\n")
    println("wählen sie eine Karte, die sie ablegen möchten: (1-5)")
    eingabe = readln().toInt()
    handSpieler2.removeAt(eingabe-1)       // Wirft die gewählte Karte ab
    karte = karteZiehen(deck)                   // Zieht eine neue Karte
    handSpieler2.add(karte)                     // Fügt die neue Karte zur Hand hinzu
    println("Ihr neu gezogene Karte ist: $karte")
    println("Finale Punktzahl: ${handPunkteV2(handSpieler2)}\n")

}


// Wendet die geschriebenen Funktionen an :)
fun zauberTrick(){
    var karten = neuesDeck()
    println("\n\n--------------------\n")
    println("Wie Sie sehen können, halte ich hier ein normales KartenDeck: $karten")
    println("\nIch werde nun die Karten mischen....")
    Thread.sleep(1500)
    kartenMischen(karten)


    println("Ziehen sie jetzt eine Karte: 0-${uebrigeKarten(karten)-1}")
    var input = readln().toInt()

    var karte = karten[input]

    println("Das ist ihre Karte: $karte \n Merken sie sich ihre Karte und geben sie verdeckt zurück")
    println("(drücken sie enter)")
    readln()

    println("Ich mische nun die Karte zurück in das Deck...")
    Thread.sleep(1500)
    kartenMischen(karten)

    var idx = karten.indexOf(karte)
    println("Nach dem mischen ist Ihre Karte nun die ${idx+1}. Karte im Stapel")
    println(karten)
}

// Karten filtern
fun filterByColor(deck: MutableList<String>, farbe: String): MutableList<String>{
    var gefiltertesDeck = deck.filter { karte -> karte.contains(farbe)}
    return gefiltertesDeck.toMutableList()

    // Auch möglich:
    // deck.filter { karte -> karte.split(" ")[0] == farbe }
}

// Karten einer farbe zählen
fun countCardsOfColor(stapel: MutableList<String>, farbe: String): Int{
    val gefilterterStapel = filterByColor(stapel, farbe)
    val anzahl = uebrigeKarten(gefilterterStapel)
    return anzahl
}