fun main(){

    var isUserLoggedIn = true
    var age = 25

    if (isUserLoggedIn) {
        if (age < 18) {
            println("Zeige Beiträge für unter 18")
        } else {
            println("Zeige Alle Beiträge")

        }
    } else {
        println("Zeige Log In Screen")
    }



    var person1Height = 180
    var person2Height = 199

    var istPerson1Groesser: Boolean = person1Height > person2Height // Ist a größer als b?:  >

    if(istPerson1Groesser){
        print("Person 1 ist größer")
    } else {
        print("Person 2 ist größer")
    }



    var eingegebenesPasswort = "passwort123"
    var echtesPasswort = "passwort321"

    if(eingegebenesPasswort == echtesPasswort){
        print("Erfolgreich eingeloggt")
    } else {
        print("Falsches Passwort. Versuche es nochmal.")

        eingegebenesPasswort = "passwort321"
        if(eingegebenesPasswort == echtesPasswort){
            print("Erfolgreich eingeloggt")
        } else {
            print("Falsches Passwort. Versuche es nochmal.")
        }
    }



    // nur gleichen Datentypen können verglichen werden!
    // var a = eingegebenesPasswort < person1Height

}