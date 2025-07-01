fun main() {
    print("Nomor kursi: ")
    val nomor = readLine()?.toIntOrNull()?:0
    val status = if (nomor % 2 == 0) "Genap" else "Ganjil"
    println("Status: $status")
}