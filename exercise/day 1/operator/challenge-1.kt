fun main() {
    print("Masukkan angka pertama: ")
    val angka1 = readLine()?.toDoubleOrNull()
    print("Operator: ")
    val operator = readLine()
    print("Masukkan angka kedua: ")
    val angka2 = readLine()?.toDoubleOrNull()

    if (angka1 == null || angka2 == null) {
        println("Input angka tidak valid.")
        return
    }

    val hasil = when (operator) {
        "+" -> angka1 + angka2
        "-" -> angka1 - angka2
        "*" -> angka1 * angka2
        "/" -> angka1 / angka2
        else -> {
            println("Operator tidak valid.")
            return
        }
    }
    println("Hasil: $hasil")
}