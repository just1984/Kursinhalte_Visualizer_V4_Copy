

fun main(){

    var i = 5

    while (i < 5){
        println(i)
    }

    do {
        println(i)
    } while (i < 5)


    val pizzaOptions = listOf("Hawaii", "Salame", "Tonno")

    pizzasRepeat(100, pizzaOptions)

    pizzasWhile(pizzaOptions)

    pizzasDoWhile(pizzaOptions)
}

fun pizzasRepeat(anzahl: Int, pizzaAuswahl: List<String>){
    val pizzen = mutableListOf<String>()

    repeat(anzahl){
        pizzen.add(pizzaAuswahl.random())
    }

    println(pizzen)

    /* jede 5. Pizza ausdrucken
    var i: Int = 0
    while(i < pizzen.size){
        print("$i: ")
        if (i % 5 == 0)
            println(pizzen[i])
        i++
    }*/


}

fun pizzasWhile(pizzaAuswahl: List<String>){
    val pizzen = mutableListOf<String>()

    while(pizzen.size < 100){
        pizzen.add(pizzaAuswahl.random())
    }

    //println(pizzen)       // Druckt pizzen in einer Zeile aus

    for (pizza in pizzen){
        println(pizza)
    }

}

fun pizzasDoWhile(pizzaAuswahl: List<String>){
    val pizzen = mutableListOf<String>()

    do{
        pizzen.add(pizzaAuswahl.random())
    } while(pizzen.size < 100)

    println(pizzen)

    // drucke die 30 bis 50

    for (i in 30..50){
        println(pizzen[i])
    }

    // Zählen wie oft kommt jede Pizza
    for (pizza in pizzaAuswahl){
        var anzahl = pizzen.count{it == pizza}
        println("$pizza: $anzahl")
    }




}