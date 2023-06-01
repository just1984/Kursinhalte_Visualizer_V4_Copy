import java.io.File
import java.util.Scanner

fun main() {
    println("")
    println("")
    println("\n--------------------------------------------------\n")
    println("Willkommen zum Projekt M2-VISUALIZRRR_V1.")
    println("Druecke ENTER fuer eine Liste der Vorlesungscodes aus dem Kurs 'Grundlagen der Programmierung'.")
    readLine()

    val basePath = "src\\INHALTE\\"
    val filesList = mutableListOf<File>()

    var lastWeek = ""

    File(basePath).walk().filter { it.isFile && it.name.endsWith(".kt") && it.readLines().size > 10 }.forEachIndexed { index, file ->
        val relativePath = file.relativeTo(File(basePath)).path.replace("\\", " -> ")
        val currentWeek = relativePath.split(" -> ")[0]

        if (currentWeek != lastWeek) {
            println("\n--------------------------------------------------\n")
            lastWeek = currentWeek
        }

        println("\u001B[33m${index + 1}\u001B[0m: $relativePath")
        filesList.add(file)
    }
    println("\n--------------------------------------------------\n")
    println("Bitte gebe die Nummer der Datei ein, die du laden möchtest:")

    val scanner = Scanner(System.`in`)
    val dateiAuswahl = scanner.nextInt()

    if (dateiAuswahl !in 1..filesList.size) {
        println("Ungültige Auswahl.")
        return
    }

    val chosenFile = filesList[dateiAuswahl - 1]
    println("\u001B[33m${chosenFile.readText()}\u001B[0m")
}
