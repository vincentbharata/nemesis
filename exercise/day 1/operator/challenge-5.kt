fun main() {
    print("Umur: ")
    val umur = readLine()?.toIntOrNull()?:0
    print("Member: ")
    val member = readLine()?.toBoolean() ?: false
    val status = (umur > 21) && member
    println("Umur: $umur")
    println("Member: $member")
    if (status) {
    println("Status: Boleh masuk")
    } else {
    println("Status: Tidak boleh masuk")
    }
}