fun main() {
    val nilai = readLine()?.toIntOrNull()
    if (nilai != null) {
        val predikat = when {
            nilai >= 85 && nilai <= 100 -> "A"
            nilai >= 70 && nilai < 85 -> "B"
            nilai >= 60 && nilai < 70 -> "C"
            nilai >= 50 && nilai < 60 -> "D"
            nilai < 50 -> "E"
            else -> "Invalid"
        }
        println("Nilai: $nilai")
        println("Predikat: $predikat")
    } else {
        println("Input tidak valid")
    }
}