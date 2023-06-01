fun main () {

    // Sets
    // Sets sind eigentlich gleich wie Listen
    // Der einzige Unterschied ist, dass wir keine Werte doppelt speichern können
    // Sets sind "elementar"
    val mySet = setOf("Orange", "Banane", "Apfel", "Orange")
    println(mySet)

    // Bei der Konvertierung von Listen zu Sets gehen doppelte Werte verloren!
    var myList = listOf("Banane", "Apfel", "Orange", "Orange")
    println(myList)
    var mySet2 = myList.toSet()
    myList = mySet2.toList()
    println(myList)

    // Konvertierung von Collections
    // unveränderbare Liste zu veränderbarer Liste konvertieren, um neuen Wert hinzuzufügen
    var myObstKorb = listOf("Orange", "Banane", "Birne")
    val myMutableObstKorb = myObstKorb.toMutableList()
    myMutableObstKorb.add("Apfel")
    // Konvertierung zurück zu unveränderbarer Liste
    myObstKorb = myMutableObstKorb.toList()

    // Exkurs: Überprüfen ob addAll funktioniert hat
    // → addAll liefert einen Boolean zurück, der aussagt, ob hinzufügen funktioniert hat
    val didItWork = myMutableObstKorb.addAll(listOf("Banane", "Orange"))
    println(didItWork)

    // Konvertierung von Maps
    var myMap: Map<String, String> = mapOf(
            "DE" to "+49",
            "AT" to "+43"
            )

    // Map zu MutableMap
    val myMutableMap = myMap.toMutableMap()
    myMutableMap["US"] = "+1"
    // Mutable Map zurück zur Map
    myMap = myMutableMap.toMap()
    println(myMap)

    // Sonderfall: Konvertierung von Maps zu Listen
    val myListFromMap = myMap.toList()
    // Die resultierende Liste enthält anschließend Pairs, also immer 2 Werte als ein Listenelement
    // auf den ersten oder zweiten Wert eines Pairs können wir dann mit first und second zugreifen
    println(myListFromMap[0].second)

    // Eine Liste an Pairs kann (wenn alle Pairs derselben Datenstruktur folgen) auch wieder zu einer Map konvertiert werden
    val myMap2 = myListFromMap.toMap()
    println(myMap2)

    // Zugriff auf Indices von List-Items
    val myNamesList = listOf("Lukas", "Noah", "Jana")
    val myAgeList = listOf(26, 22, 25)

    // Eine Map aus zwei Listen machen → myNamesList ist der Key und myAgeList der Value
    val map: Map<String, Int> = myNamesList.zip(myAgeList).toMap()
    println(map)

    // Index eines bestimmten Objekts herausfinden
    val index = myNamesList.indexOf("Noah")
    val name = myNamesList[index]
    val age = myAgeList[index]
    println("$name is $age years old.")

    // Index des minimalsten Werts herausfinden
    val smallestValue = myAgeList.min()
    val indexOfYoungest = myAgeList.indexOf(smallestValue)
    val nameOfYoungest = myNamesList[indexOfYoungest]
    println("The youngest is $nameOfYoungest with an age of $smallestValue")

}