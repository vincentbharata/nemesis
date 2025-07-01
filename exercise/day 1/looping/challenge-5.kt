fun main() {
    print("Input: ")
    val teks = readLine()
    print("Jumlah: ")
    val jumlah = readLine()?.toIntOrNull() ?: 0
    println("\nOutput:")
    for (i in 1..jumlah) {
        println(teks)
    }
}