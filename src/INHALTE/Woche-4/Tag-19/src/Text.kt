

fun main(){

    var testString: String = "Hallo, ich bin der Kotlin12345. Der der der"

    println(testString.length)

    println(testString[5])

    println(testString.slice(7..15))

    var mutableString = StringBuilder(testString)
    println(mutableString)

    mutableString[1] = 'A'
    println(mutableString)


    testString = testString.replace("i", "")
    println(testString)

    testString.lowercase()
    testString.uppercase()

    testString.capitalize()     // hallo -> Hallo


    testString.replaceRange(4, 4, "ab")


    var passwort = "Hallo"
    passwort = passwort.padEnd(8, '4')

    println(passwort)


    var zeileAusTabelle = "Name,Alter,Größe"
    var zeile2AusTabelle = "Gordon,28,1.75"
    zeileAusTabelle.split(",")



    // alle 'a' oder 'A' im Text zählen
    testString.count{it -> it == 'a' || it == 'A'}


}