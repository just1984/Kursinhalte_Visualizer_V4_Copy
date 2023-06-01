fun main(){
    //  Simpler 10x loop
    var i: Int = 0
    while (i < 10){
        println(i)
        i ++   // i = i + 1
    }

    // Alternative mit Repeat:
    repeat(10){ it ->
        println(it)
    }


    // Waschmaschine Loop
    var strom = true
    val dauer = 90
    while(strom){
        var minuten = 0
        while (minuten < dauer - 10){
            println("Waschen")
            minuten ++
        }
        while (minuten < dauer){
            println("Schleudern")
            minuten ++
        }
        strom = false
    }
    println("die Waschmaschine ist fertig, bieb bieb bieb")
}