package com.gamgam

fun main() {
    for (a in 1..3) { //a: Int in 1..3
        println(a)
    }

    val numbers = 1..100

    for (a in numbers) {
        println(a)
    }

    for (a in 100 downTo 1) {
        println(a)
    }

    for (a in 100..1) {
        println(a)
    }

    for (b in 100 downTo 1 step 5) {
        println(b)
    }

    val capitals = listOf("London", "Parins", "Rome", "Madrid")
    for (capital in capitals) {
        println(capital)
    }

    myLoop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j % i == 0) {
                break@myLoop
            } else if (j % i == 1) {
                continue@myLoop
            } else if (j % i == 2) {
                break
            } else if (j % i == 3) {
                continue
            } else {
                println(i * j)
            }
        }
    }

}
