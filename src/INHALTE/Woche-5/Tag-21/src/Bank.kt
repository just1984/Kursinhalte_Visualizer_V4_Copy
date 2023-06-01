//Globale Variable kann in allen Funktionen verwendet werden.
//Konten sind als Map gespeichert (name des Kontos, Geldbetrag auf dem Konto)
//Schreibe die Funktionen, sodass diese die Map bank direkt verändern
var bank: MutableMap<String, Double> = mutableMapOf(
    "Gordon" to 50.0,
    "Minh" to 500.0,
    "Bassam" to 150.0,
    "Luc" to 200.0,
    "Eduard" to 250.0,
    "Anna" to 300.0,
    "Cüneyt" to 350.0,
    "Nico" to 400.0,
    "Laurenz" to 450.0
)


fun main() {
    println("Willkommen zur Syntax Bank. Loggen sie sich mit ihrem Namen ein:")
    var konto: String = readln()
    hauptMenu(konto)

/*
    //Hier soll die Programmsteuerung implementiert werden. d.H hier sollen nur Funktionen aufgerufen werden.
    println(bank)
    println(kontoStand("Gordon"))
    println(kontoStand("xyz"))
    kontoHinzufuegen("test", 10.0)
    kontoLoeschen("test")
    kontoLoeschen("Nico")
    kontoLoeschen("Nico")
//    println(bank)
    geldAbheben("Gordon", 1000.0)
//    println(bank)
    geldEinzahlen("Laurenz", 100.0)
    println(kontoStand("Laurenz"))
    geldUeberweisen("Laurenz", "Gordon", 120.0)
//    println(bank)

    //Hier sollten Warnungen ausgeben werden
    kontoHinzufuegen("Laurenz", 10.0)
    kontoLoeschen("test2")*/
}


//TODO:
// Schreibe ein Funktion, die den Betrag eines Kontos zurückgibt.
// Nutze einen Parameter Konto:String um der Funktion zu sagen,
// welches Konto zurückgegeben werden soll.
// Gibt es das Konto in unserer Bank nicht, soll eine Warnung ausgedruckt werden!
// Bei dieser Methode ist ein Rückgabewert erwünscht, der Betrag kann aber auch direkt auf der Konsole ausgeben werden.
fun kontoStand(konto: String): Double? {
    if (konto in bank) { // auch möglich:  bank.keys.contains(konto)
        //konto existiert
        return bank[konto]
    } else {
        //konto existiert nicht
        println("Das Konto '$konto' existiert nicht")
        throw Exception("Das Konto '$konto' existiert nicht")
        return null
    }
}

//TODO:
// Schreibe eine Funktion, die neue Konten zur Bank hinzufügen soll.
// Als Parameter wählen sie einen Namen:String und einen Geldbetrag:Double
fun kontoHinzufuegen(konto: String, betrag: Double = 0.0) {
    if (konto in bank) {
        //Konto existiert bereits
        println("Ein Konto unter dem Namen '$konto' existiert bereits! ")
    } else {
        //konto existiert noch nicht
        bank[konto] = betrag
        println("Das Konto für '$konto' wurde erfolgreich erstellt")
    }
}

//TODO:
// Schreibe eine Funktion, die bestehende Konten entfernt.
// Nutzt als Parameter den Namen:String. Dieses konto soll aus der Map entfernt werden.
// Gibt es das Konto in der Bank nicht, soll eine Warnung gedruckt werden.
fun kontoLoeschen(konto: String) {
    if (bank.containsKey(konto)) {
        //Konto existiert
        var betrag: Double = bank.remove(konto)!!
        println("Das konto '$konto' wurde erfolgreich entfernt")
        println("Sie erhalten natürlich noch ihren Betrag von $betrag €.")
    } else {
        //konto existiert noch nicht
        println("Es existiert kein Konto unter dem Namen '$konto'! ")
    }
}

//TODO:
// Schreibe eine Funktion die eine Auszahlung am Geldautomaten simuliert.
// Nutze einem Parameter name:String, um das richtige Konto auszuwählen und
// einen weiteren für den Geldbetrag, der abgehoben werden soll.
// Berechnet den neuen Betrag und speichert ihn in der map Bank ab.
// Gibt es das Konto nicht soll eine Warnung gedruckt werden.
fun geldAbheben(konto: String, betrag: Double) {
    if (bank.containsKey(konto)) {
        //Konto existiert bereits
        var kontoStand: Double = kontoStand(konto)!!

        if (betrag > 500.0){
            //Auszahlung nicht möglich, da zu hoher Betrag
            println("Auszahlung fehlgeschlagen. \n Maximaler Betrag: 500.00€")
        } else if(betrag > kontoStand){
            println("Auszahlung fehlgeschlagen. \n Nicht ausreichender Kontostand")
        } else {
            //Auszahlung möglich
            bank[konto] = kontoStand - betrag
            println("Die Auszahlung war erfolgreich. Es sind jetzt noch ${bank[konto]!!}€ auf dem Konto von $konto")
        }
    } else {
        //konto existiert noch nicht
        println("Es existiert kein Konto unter dem Namen '$konto'! ")
    }
}

//TODO schreibe eine Funktion die eine Einzahlung am geldautomaten simuliert. Nutze einem Parameter name:String um das richtige Konto auszuwählen
// und einen weiteren für den Geldbetrag, der eingezahlt werden soll. Berechnet den neuen Betrag und speichert ihn in der map bank ab.
// Gibt es das Konto nicht, wird eine Warnung gedruckt und ein neues Konto angelegt.
fun geldEinzahlen(konto: String, betrag: Double) {
    if (betrag <= 0){
        println("Sie müssen einen positiven Betrag einzahlen")
    } else {
        if (bank.containsKey(konto)) {
            //Konto existiert bereits betrag auf bank[konto] addieren
            bank[konto] = kontoStand(konto)!! + betrag
        } else {
            //konto existiert noch nicht neues Konto erstellen mit betrag
            println("Das Konto existiert nicht! Es wird ein neues Konto für Sie angelegt")
            kontoHinzufuegen(konto, betrag)
        }
    }
}

//TODO schreibe eine Funktion, die eine Überweisung simuliert.
// Als 1. Parameter soll das konto, von dem aus überwiesen wird, verwendet werden.
// als 2. soll das konto, auf das überwiesen wird, genutzt werden und
// als letzten Parameter den Betrag, der überwiesen werden soll.
// Berechnet die neuen Beträge der beiden Konten und speichert diese wieder in bank ab
fun geldUeberweisen(sender: String, empfaenger: String, betrag: Double) {
    //Prüfung, ob beide Konten existieren
    if (bank.containsKey(sender) && bank.containsKey(empfaenger)) {
        //Prüfung ob konto1 genug Geld hat
        if (kontoStand(sender)!! >= betrag) {
            //Überweisung
            bank[sender] = bank[sender]!! - betrag
            bank[empfaenger] = bank[empfaenger]!! + betrag
            println("Die Überweisung war erfolgreich")
        } else {
            println("Nicht ausreichender Kontostand. Überweisung wurde Storniert")
        }
    } else {
        if (sender !in bank){
            println("Es existiert kein Konto '$sender'")
        }
        if (empfaenger !in bank){
            println("Es existiert kein Konto '$empfaenger'")
        }
        println("Überweisung wurde storniert.")
    }
}


fun hauptMenu(konto: String){
    println("""
        Was möchten sie tun?
        [0]     Transaktion beenden
        [1]     Kontostand ablesen
        [2]     Geld abheben
        [3]     Geld einzahlen
        [4]     Geld überweisen
        [5]     Neues Konto Erstellen
        [6]     Konto löschen
    """.trimIndent())

    var input: String = readln()

    when(input){
        "0" -> println("Danke, bis Bald :)")
        "1" -> {
            println("Ihr aktueller KontoStand: ${kontoStand(konto)}")
            hauptMenu(konto)
        }
        "4" -> {
            println("Geben sie den Namen des Empfängers ein:")
            var empfaenger: String = readln()
            println("Wie viel Geld möchten sie überweisen:")
            var betrag: Double = readln().toDouble()
            geldUeberweisen(konto, empfaenger, betrag)
            hauptMenu(konto)
        }
        else -> {
            println("Ungültige Eingabe")
            hauptMenu(konto)
        }
    }
}