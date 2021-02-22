package com.gamgam

fun main() {
    val myVariable = 5

    val result = if (myVariable == 5) {
        println("Variable is $myVariable")
        3
    } else {
        "Not 3"
    }

    val whenResult = when (result) {
        3 -> {
            println("Number is $result")
            12
        }
        is String -> {
            println("Result is not a integer")
            println("second line")
            10
        }
        else -> -1
    }

    println(whenResult)
}


