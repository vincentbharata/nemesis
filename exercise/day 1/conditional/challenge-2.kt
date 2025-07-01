fun main() {
    val umur = readLine()?.toIntOrNull()
    val vip = readLine()?.toBoolean() ?: false
    val status = if (umur != null && umur > 18 && vip) {
        "Diperbolehkan masuk"
    } else {
        "Tidak diperbolehkan masuk"
    }
    println()
    println("Umur: $umur")
    println("Member VIP: $vip")
    println("Status: $status")
    }