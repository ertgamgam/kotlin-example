package com.gamgam.classes

object Global {
    var PI = 3.14
    val PI2 = 3.14
}
//object provides an easy way to create singletons
fun main() {
    println(Global.PI)
    Global.PI = 23.345
    println(Global.PI)
    println(Global.PI2)

    val localObject = object {
        val PI = 3.14
    }

    println("LocalObject PI = ${localObject.PI}")
}