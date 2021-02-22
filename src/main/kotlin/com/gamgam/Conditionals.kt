package com.gamgam

fun main() {
    val myVariable = 5

    val result = if (myVariable == 5) {
        println("Variable is $myVariable")
        3
    } else {
        "Not 3"
    }

    when (result) {
        3 -> println("Number is $result")
        is String -> println("Result is not a integer")
    }
}


