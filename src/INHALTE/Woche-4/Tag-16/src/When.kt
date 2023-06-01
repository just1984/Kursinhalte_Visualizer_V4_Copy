
fun main(){








//
//    var myAge: Int = (0..100).random()
//    when (myAge){
//        in 0..15 -> {
//            println("Es wurden unalkoholische Getränke angezeigt")
//        }
//        in 16..17 -> {
//            println("zusätzlich werden Bier und Wein angezeigt")
//        }
//        else -> {
//            println("Alle Getränke werden angezeigt")
//        }
//
//
//    }
//

//    println(getMonthAsInt("Januar"))




    // TODO: Beispiel: Input von Readln()

    // TODO: Beispiel das Monat in Text Umwandelt

    // TODO: Beispiel das Wochentag in True/False umwandelt (wochenende)
}



fun monatsEingabe(){

    println("Geben sie ihren GeburtsMonat an:")
    var monat: String = readln()    // ""

    when (monat){
        "1", "Jan", "Januar" -> {
            println("Sie haben im Januar Geburtstag")
        }
        "2" -> {
            println("Ahh ein Februar kind")
        }
        else -> {
            println("falsche Eingabe! 😢")
            monatsEingabe()
        }
    }
}


// TODO: Beispiel: Input von Readln() (Auswahlmöglichkeiten)
fun atmAuswahl(){
    println("Drücken sie die 1 um ihren Kontostand abzufragen, drücken sie 2 für Guthaben hinzufügen....")
    var input: String = readln()

    if (input == ""){
        atmAuswahl()
    } else {
        var inputInt = input.toInt()
        when (inputInt){
            1 -> println("Kontostand Abfragen")
            2 -> println("Guthaben hinzufügen")
            3 -> println("Ausloggen")
            else -> println("Fehler")
        }
    }

}

// TODO: Beispiel das Monat in Text Umwandelt
fun getMonthAsInt(month: String): Int{
    return when (month){
        "Januar" -> 1
        "Februar" -> 2
        "März" -> 3
        else -> {
            0
        }
    }
}

fun tageDesMonats(month: String): Int{
    var schaltJahr = false
    return when (month){
        in listOf("Januar", "März", "Mai", "Juli", "August", "Oktober", "Dezember") -> 31
        "Februar" -> {
            if (schaltJahr){
                return 29
            }
            else
                return 28
        }
        else -> {
            30
        }
    }
}

// TODO: Beispiel das Wochentag in True/False umwandelt (wochenende)
fun isWeekend(wochenTag: String){

}
