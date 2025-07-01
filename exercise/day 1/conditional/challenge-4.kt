fun main() {
    println("Menu:")
    println("1. Nasi Goreng")
    println("2. Mie Ayam")
    println("3. Ayam Geprek")
    print("Pilihan: ")
    val pilihan = readLine()?.toIntOrNull()
    val menu = when (pilihan) {
        1 -> "Nasi Goreng"
        2 -> "Mie Ayam"
        3 -> "Ayam Geprek"
        else -> "Unknown"
    }
    if (menu != null) {
        println("Kamu memilih: $menu")
    } else {
        println("Invalid")
    }
}