package com.gamgam.inheritanceinkotlin

abstract class StoredEntity {
    abstract fun store()

    fun status() {
        println("active")
    }
}

class Employee : StoredEntity() {
    override fun store() {
        println("Override abstract method")
    }

}

fun main() {
    val employee = Employee()
    employee.store()
    employee.status()4
}