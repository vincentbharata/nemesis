fun main (){
    val username = "admin"
    val password = "1234"
    val inputUsername = readLine()
    val inputPassword = readLine()
    if (inputUsername == username && inputPassword == password) {
        println("Login berhasil!")
    } else {
        println("Username/password salah")
    }
}