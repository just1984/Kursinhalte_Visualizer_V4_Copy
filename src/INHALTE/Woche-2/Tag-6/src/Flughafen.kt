fun main() {
//    aufgabe1()
//    aufgabe2()
    aufgabe3()

}


fun aufgabe1(){
    println("\nAufgabe 1: \n")
    /*
    Damit die Fluggesellschaft einen komfortablen Flug bieten kann,
    benötigt sie ein paar Informationen über die Passagiere.
    Bei Verspätungen oder Nicht-Erscheinen, sind beispielsweise Kontaktdaten von Vorteil.
    Um den Kunden auch ein gutes gastronomisches Angebot zu machen,
    ist es für die Fluggesellschaft außerdem gut zu wissen, ob die Kunden vegetarisch sind.

    TODO: Erstelle die 7 folgenden Variablen mit den passenden Datentypen:
            name, vorname, email, telefonnummer, geburtsjahr, reiseziel, vegetarisch.
    TODO: Diese Variablen sollen über Konsoleneingaben befüllt werden.
    TODO: Anschließend sollst du einen sogenannten Boarding Pass auf der Konsole ausgeben
     */

    // Variablen erstellen
    val name: String
    val vorname: String
    val geburtsjahr: Int
    val geschlecht: Char
    val email: String
    val telefonnummer: String
    val reiseziel: String
    val vegetarisch: Boolean

    // Variablen befüllen
    println("Geben sie ihren Nachnamen ein:")
    name = readln()

    println("Geben sie ihren Vornamen ein:")
    vorname = readln()

    println("Geben sie ihr Geburtsjahr ein:")
    geburtsjahr = readln().toInt()

    println("Geben sie ihr Geschlecht ein: (m/w/d)")
    geschlecht = readln().first()

    println("Geben sie ihre Email ein:")
    email = readln()

    println("Geben sie ihre Telefonnummer ein:")
    telefonnummer = readln()

    println("Geben sie ihr Reiseziel ein:")
    reiseziel = readln()

    println("Wollen sie das vegetarische Menu? (true / false)")
    vegetarisch = readln().toBoolean()

    // Boarding Pass ausdrucken
    val boardingPass: String = """
            BOARDING PASS
            $reiseziel
        ${name.uppercase()} $vorname, $geschlecht, geb: $geburtsjahr
        Email: $email
        Telefon: $telefonnummer
        vegetarisch: $vegetarisch 
    """
    println(boardingPass)


    println("Bitte überprüfen sie Ihre Eingaben. Bestätigen sie mit Enter.")
    readln()
}

fun aufgabe2(){
    println("\nAufgabe 2: \n")

    /*
    Die Fluggesellschaft bietet ein Sonderangebot: einen Hin- und Rückflug für eine 4-köpfige Familie.
    Ein Ticket kostet 125Euro pro Passagier und dein Kontostand beträgt 650Euro.

    TODO:  Erstelle die benötigten Variablen, um die Tickets zu kaufen.
    TODO:  Berechne den Gesamtpreis und den finalen Kontostand.
    TODO:  Speichere diese in passenden Variablen und gib sie auf der Konsole aus.
     */

    val ticketPreis: Double = 125.00
    var kontoStand: Double = 650.00

    val gesamtPreis = ticketPreis * 4
    kontoStand -= gesamtPreis       // kontoStand = kontoStand - gesamtPreis

    println("Gesamtpreis: $gesamtPreis")
    println("Ihr Kontostand nach der Transaktion: $kontoStand")
}

fun aufgabe3(){
    println("\nAufgabe 3: \n")

    /*
    Das Flugzeug hat 130 Sitzplätze, wieviele 4-köpfige Familien können mit dem Flugzeug mitgenommen werden?
    TODO: Gib das Ergebnis auf der Konsole aus.
    */
    val sitzPlaetze = 130
    val familien = sitzPlaetze / 4
    println("Bei $sitzPlaetze Sitzplätzen passen $familien Gruppen ins Flugzeug.")

    /*
    Wie viele freie Sitzplätze gibt es, wenn 25 4-köpfige Familien die Tickets kaufen?
    TODO: Gib das Ergebnis auf der Konsole aus.
     */
    val freieSitzPlaetze = sitzPlaetze - 25*4
    println("Bei 25 Buchungen bleiben noch $freieSitzPlaetze Sitze frei.")

    /*
    Der Flug kostet die Fluggesellschaft 16€ pro Kilometer.
    Die Flugstrecke von Berlin nach Mailand beträgt 1034.93 Kilometer.
    TODO: Wie teuer ist der Flug? Gib das Ergebnis auf der Konsole aus.
    */
    val preisProKM = 16.00
    val distanz = 1034.93

    val flugPreis = preisProKM * distanz * 2
    println("Der Flug kostet für die Fluggesellschaft $flugPreis €.")

    /*
    TODO: Bringt dieser Flug der Fluggesellschaft einen Gewinn, wenn 130 Passagiere mitfliegen?
     */
    val ticketPreis: Double = 125.00
    val einnahmen = sitzPlaetze * ticketPreis
    val gewinn = einnahmen - flugPreis

    println("Wenn der Flieger komplett ausgebucht ist, erwirtschaftet die Fluggesellschaft durch die Sonderaktion ${gewinn} €.")

    // kosten pro Sitzplatz
    val kostenProSitzplatz = flugPreis / sitzPlaetze
    println("Die Kosten pro Sitzplatz sind: $kostenProSitzplatz")



    // TODO: Farben hinzufügen
    /*
        TODO:
        TODO:
     */

}
