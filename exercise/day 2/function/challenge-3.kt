fun konversiSuhu(celcius: Double): Double {
    return (celcius * 9 / 5) + 32
}
fun main() {
    val input = readLine()
    val celcius = input?.toDoubleOrNull() ?: 0.0
    val fahrenheit = konversiSuhu(celcius)
    println("Fahrenheit: ${String.format("%.2f", fahrenheit)}")
}