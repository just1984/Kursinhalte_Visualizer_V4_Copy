fun main() {

    // User abfragen
    println("Username: (mit enter bestätigen)")
    var username = readln() // readln erwartet immer Bestätigung mit enter


    // Passwort abfragen
    println("Password: ")
    val passwort = "pw123"

    // jetzt wird Bestätigung ausgedruckt
    println("Ihr neuer Account wurde erstellt mit den folgenden Daten:")
    println("Username: $username\nPasswort: $passwort")

}