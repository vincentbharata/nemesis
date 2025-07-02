fun tambah(num1: Int, num2: Int): Int {
    return num1 + num2
}
fun kurang(num1: Int, num2: Int): Int {
    return num1 - num2
}
fun kali(num1: Int, num2: Int): Int {
    return num1 * num2
}
fun bagi(num1: Int, num2: Int): Int {
    return num1 / num2
}
fun main() {
    print("Masukkan angka pertama: ")
    val num1 = readLine()?.toIntOrNull() ?: 0
    print("Masukkan angka kedua: ")
    val num2 = readLine()?.toIntOrNull() ?: 0
    print("Pilih operasi: ")
    val operasi = readLine()

    val hasil = when (operasi) {
        "+" -> tambah(num1, num2)
        "-" -> kurang(num1, num2)
        "*" -> kali(num1, num2)
        "/" -> bagi(num1, num2)
        else -> {
            println("Invalid")
            return
        }
    }
    println("Hasil: $hasil")
}