package com.gamgam.classes

import java.lang.IllegalArgumentException
import java.util.*

class Customer {
    // there is no such concept as a field in kotlin
    var id = 0 //property
    var name: String = "" //explicit declaration
    val surname: String = "immutable"//immutable
}

class Person(initId: Int, initName: String = "") {
    var id: Int = initId
    var name: String = initName

    init {
        name = name.toUpperCase()
    }
}

class People(var id: Int, var name: String, val yearOfBirth: Int) { // this two arguments also property ( this is primary constructor)

    constructor(email: String, name: String, id: Int, yearOfBirth: Int) : this(id, name, yearOfBirth) { // this is secondary constructor

    }

    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social security shoul start with SN")
            }
            field = value
        }

}


fun main() {
    val customer = Customer()
    customer.id = 10
    customer.name = "Hadi"

    val person = Person(10, "gamgam")
    println(person.name)

    val people = People(11, "People", 345)
    println(people.id)
    println(people.age)
    people.socialSecurityNumber = "SN234324"
    println(people.socialSecurityNumber)

}