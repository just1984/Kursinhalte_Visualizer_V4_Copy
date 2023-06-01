fun main(){

//    var zahl: Int?
//    // println(zahl)    // auch Nullable Datentypen müssen initialisiert werden
//
//
//    // Beispiel: Formular ausfüllen
//    var addresse: String = readln()
//    var addressZusatz: String? = null
//
//    addressZusatz = "linke Tür"
//
//    // Readln ohne Eingabe ist nicht null, sondern "" (ein leerer String)
//    var eingabe: String? = readln()
//    println("eingabe: $eingabe")



    // Nullable Zahlen
    // Elvis Operator = ?
    var zahl1: Int? = null
    var zahl2: Int = 10

    var ergebnis1: Int? = zahl1?.plus(zahl2)
    println("Ergebnis1: $ergebnis1")

    // !! operator
    var zahl3: Double = 2.4
    var zahl4: Double? = 1.2

    var result2: Double = zahl3 + zahl4!! // zahl4?.plus(zahl3)
    println("result2: $result2")


    // Beispiel: Login
    var userName: String?
    print("What is your username? ")
    userName = readln()
    println("Hello $userName!")

    print("Press enter to logout..")
    readln()
    userName = null

}