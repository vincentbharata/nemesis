fun main() {
    while (true) {
        println("1. Lihat menu")
        println("2. Beli")
        println("3. Keluar")
        print("Pilih: ")
        val input = readLine()?.toIntOrNull() ?: 0
        when (input) {
            1 -> println("Menu: Nasi Goreng, Mie Ayam\n")
            2 -> println("Beli.\n")
            3 -> {println("Terima kasih!")
                break
            }
            else -> println("Pilihan tidak valid.\n")
        }
    }
}