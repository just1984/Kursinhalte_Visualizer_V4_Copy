package Kreise

import PI

fun kreisUmfang(){

    // TODO: Berechne den Umfang eines Kreises. Formel: 2 * r * pi
    println("Geben sie den Radius des Kreises ein: ")
    var radius = readln().toDouble()
    var umfang = 2 * radius * PI
    println("Ein Kreis mit Radius $radius hat einen Umfang von $umfang")

}