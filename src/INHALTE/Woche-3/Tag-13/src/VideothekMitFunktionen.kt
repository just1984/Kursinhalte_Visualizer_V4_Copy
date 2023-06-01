fun main() {

    var movies: MutableList<String> = mutableListOf("Midsommar", "Dune", "Mulholland Drive", "Interstellar")
    var prices: MutableList<Double> = mutableListOf(4.99, 5.99, 2.99, 7.99)

    verkaufen(1, movies, prices, 50.0)
    verkaufen(2, movies, prices, 60.0)
    addMovie(movies, prices, "The Batman", 19.99)
    verkaufen(3, movies, prices, 60.0)

}

fun verkaufen(customerNumber: Int, movies: MutableList<String>, prices: MutableList<Double>, budget: Double) {
    println()
    println("Hello customer $customerNumber!")
    println("We have the following movies in stock: $movies")
    println("The prices are: $prices")
    println("Our best offer is ${findCheapestMovie(movies, prices).first} for a price of ${findCheapestMovie(movies, prices).second}")
    println("Which movie do you want to buy?")
    var input = readln()
    var indexOfInput = movies.indexOf(input)
    var price = prices[indexOfInput]
    println("You have bought $input for a price of $price")
    val newbudget = budget - price
    movies.removeAt(indexOfInput)
    prices.removeAt(indexOfInput)
    println("Your remaining budget is now $newbudget")
}

fun findCheapestMovie(movies: List<String>, prices: List<Double>): Pair<String, Double> {
    val smallestPrice = prices.min()
    val indexOfSmallesPrice = prices.indexOf(smallestPrice)
    val title = movies[indexOfSmallesPrice]
    return Pair(title, smallestPrice)
}

fun addMovie(movies: MutableList<String>, prices: MutableList<Double>, title: String, price: Double) {
    movies.add(title)
    prices.add(price)
}