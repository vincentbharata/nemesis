fun halo(nama: String = "Pengunjung") {
    println("Halo, $nama!")
}
fun main() {
    val input = readLine()
    if (input.isNullOrBlank()) {
        halo()
    } else {
        halo(input)
    }
}