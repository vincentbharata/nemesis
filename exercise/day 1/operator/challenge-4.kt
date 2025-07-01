fun main() {
    print("Angka A: ")
    val num1 = readLine()?.toIntOrNull()?:0
    print("Angka B: ")
    val num2 = readLine()?.toIntOrNull()?:0
    val lebihBesar = if (num1 > num2) num1 else num2
    println("Angka lebih besar: $lebihBesar")
}