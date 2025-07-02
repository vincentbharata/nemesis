fun sapa(name: String) {
    println("Halo, $name!")
}
fun main() {
    val name1 = readLine()?:""
    val name2 = readLine() ?:""
    sapa(name1)
    sapa(name2)
}