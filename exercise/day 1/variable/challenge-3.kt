fun main() {
    val nama = readLine()
    val statusAktif = readLine()?.toBoolean() ?: false
    println("Nama: $nama")
    println("Mahasiswa Aktif: $statusAktif")
}