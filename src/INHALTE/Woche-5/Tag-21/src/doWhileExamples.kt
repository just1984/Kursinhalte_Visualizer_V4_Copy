fun main(){

    // Beispiel 1: Haende Waschen
    do {
        val haendeNochDreckig: Boolean = haendeWaschen()
    } while (haendeNochDreckig)

    // Alternative mit While:
    var haendeNochDreckig = true
    while(haendeNochDreckig){
        haendeNochDreckig = haendeWaschen()
    }

    // Beispiel 2: PIN Eingabe
    val gesuchtePIN = "1234"
    do {
        val pinEingabe = readln()
    } while (pinEingabe != gesuchtePIN)

}

fun haendeWaschen(): Boolean {
    // Gibt zufällig aus, ob die Hände jetzt sauber sind
    return listOf(true, false).random()
}