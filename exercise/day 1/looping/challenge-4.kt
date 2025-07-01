fun main() {
    while (true) {
        println("1. Lihat menu")
        println("2. Beli")
        println("3. Keluar")
        print("Pilih: ")
        val input = readLine()?.toIntOrNull() ?: 0
        when (input) {
            1 -> println("Menu: Nasi Goreng, Mie Ayam")
            2 -> println("Beli.")
            3 -> {println("Terima kasih!")1
                break
            }
            else -> println("Pilihan tidak valid.")
        }
    }
}