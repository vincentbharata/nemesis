fun main(){
    val nama = readLine()
    val jumlahBarang = readLine()?.toIntOrNull() ?: 0
    val hargaBarang = readLine()?.toDoubleOrNull() ?: 0.0
    val totalHarga = jumlahBarang * hargaBarang
    println("Barang: $nama")
    println("Jumlah: $jumlahBarang")
    println("Harga Satuan: $hargaBarang")
    println("Total: $totalHarga")
}