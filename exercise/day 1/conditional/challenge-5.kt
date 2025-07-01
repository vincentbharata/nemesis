fun main() {
    print("Umur: ")
    val umur = readLine()?.toIntOrNull() ?: 0
    print("Member VIP (true/false): ")
    val isVip = readLine()?.toBoolean() ?: false
    if (umur > 18 && isVip) {
        println("Status: Diperbolehkan masuk")
    } else {
        println("Status: Tidak diperbolehkan masuk")
    }
}