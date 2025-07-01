fun main() {
    val nilai = readLine()?.toDoubleOrNull() ?: 0.0
    val skala = nilai / 25
    val hasil = String.format("%.2f", skala)
    println("Nilai $nilai -> skala 4.0 = $hasil")
}