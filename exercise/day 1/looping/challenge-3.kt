fun main() {
    val list = mutableListOf<Int>()
    for (i in 1..5) {
        print("Enter score: ")
        val score = readLine()?.toIntOrNull() ?: 0
        list.add(score)
    }
    val total = list.sum()
    val average = total.toDouble() / list.size
    println("Total: $total")
    println("Average: $average")
}