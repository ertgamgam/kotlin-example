package com.gamgam

fun main() {
    val number1 = 123 //val not a dynamic type and immutable type
    println(number1)

    val name: String = "gamgam test"
    println(name)

    val myInt: Int = 234 //int object in kotlin
    println(myInt)

    val myLong = 10L
    val myFloat = 100F

    val myLong2 = myInt.toLong()
    println(myLong)
    println(myFloat)
    println(myLong2)

    val escapeCharacters = "e new line \n"
    val rawString = "Hello\n" +
            "this is second line\n" +
            "and third\n"
    val rawString2 = """
            this is a string
            and work fine
            its really
            amazing
    """.trimIndent()

    println(escapeCharacters)
    println(rawString)
    println(rawString2)

    val years = 10F
    val message = "Years = $years"

    val anotherMessage = "Length of nae is ${name.length}"

    println(message)
    println(anotherMessage)


}