fun main() {
    val tahun_lahir = readLine()?.toIntOrNull()?: 0
    val tahun_sekarang = readLine()?.toIntOrNull()?: 0
    val umur = tahun_sekarang - tahun_lahir
    println("Tahun lahir: $tahun_lahir")
    println("Tahun sekarang: $tahun_sekarang")
    println("Usia Anda: $umur tahun")
}