fun main() {
    print("Total belanja: ")
    val total = readLine()?.toDoubleOrNull() ?: 0.0
    println("Diskon: ")
    var diskon = readLine()?.toDoubleOrNull() ?: 0.0
    if (total > 100_000) {
        diskon = total * 0.10
    }
    val bayar = total - diskon
    println("Total bayar: ${bayar.toInt()}")
}