val dataNilai = mutableMapOf<String, MutableList<Int>>()

fun tambahDataSiswa() {
    print("Nama siswa: ")
    val nama = readLine()!!
    print("Jumlah nilai: ")
    val jumlah = readLine()!!.toInt()
    val nilai = mutableListOf<Int>()
    for (i in 1..jumlah) {
        print("Nilai ke-$i: ")
        nilai.add(readLine()!!.toInt())
    }
    dataNilai[nama] = nilai
    println("Data ditambahkan!\n")
}

fun hitungRataRata(nilai: List<Int>) = nilai.average()

fun lihatSemuaData() {
    if (dataNilai.isEmpty()) {
        println("Belum ada data.\n")
        return
    }
    dataNilai.forEach { (nama, nilai) ->
        println("Nama: $nama")
        println("Nilai: ${nilai.joinToString(", ")}")
        println("Rata-rata: ${hitungRataRata(nilai)}\n")
    }
}

fun cariNilaiTertinggi() {
    val siswa = dataNilai.maxByOrNull { it.value.maxOrNull() ?: 0 }
    if (siswa != null) {
        println("Siswa dengan nilai tertinggi:")
        println("Nama: ${siswa.key}")
        println("Nilai tertinggi: ${siswa.value.maxOrNull()}\n")
    } else {
        println("Belum ada data.\n")
    }
}

fun siswaYangLulus() {
    val lulus = dataNilai.filter { hitungRataRata(it.value) >= 75 }
    if (lulus.isEmpty()) {
        println("Tidak ada siswa yang lulus.\n")
    } else {
        println("Siswa yang lulus:")
        lulus.forEach { (nama, nilai) ->
            println("Nama: $nama")
            println("Rata-rata: ${hitungRataRata(nilai)}\n")
        }
    }
}

fun main() {
    while (true) {
        println("=== MENU NILAI SISWA ===")
        println("1. Tambah Nilai Siswa")
        println("2. Lihat Semua Data")
        println("3. Cari Nilai Tertinggi")
        println("4. Siswa yang Lulus")
        println("5. Keluar\n")
        print("Pilih menu: ")
        when (readLine()) {
            "1" -> tambahDataSiswa()
            "2" -> lihatSemuaData()
            "3" -> cariNilaiTertinggi()
            "4" -> siswaYangLulus()
            "5" -> {
                println("Terima kasih!")
                break
            }
            else -> println("Pilihan tidak valid!\n")
        }
    }
}