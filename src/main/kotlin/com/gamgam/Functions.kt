package com.gamgam.functions

fun hello() {  // hello() : Unit { // by default return type is unit equivalent to void
    println("hello")
}

fun throwingException(): Nothing {
    throw Exception("This function throws an exception")
}

fun returnAFour(): Int {
    return 4
}

fun takingString(name: String) {
    println(name)
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun sum2(x: Int, y: Int, z: Int = 0) = x + y + z //fun sum2(x: Int, y: Int): Int = x + y

fun printDetails(name: String, email: String = "", phone: String) {
    println("name: $name , email: $email , phone: $phone ")
}

fun printStrings(vararg strings: String) {
    reallyPrintingStrings(*strings)  // * = spread operator to pass vararg
}

private fun reallyPrintingStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main() {
    hello()

    val result = sum2(3, 45) + sum(3, 6)
    println(returnAFour())
    takingString("test")
    println(sum2(4, 6))
    printDetails("Hadi", phone = "gamgam")
    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")

}