package com.gamgam.inheritanceinkotlin


interface CustomerRepository {
    val isEmpty: Boolean
        get() = true

    val getCount: Int

    fun getById(id: Int): Customer

    fun save(customer: Customer) {
        println("Customer saved")
    }
}

class SqlRepository(override val getCount: Int) : CustomerRepository {
    override fun getById(id: Int): Customer {
        return Customer()
    }

    override fun save(customer: Customer) { // not necessary but possible
        println("override save")
        super.save(customer)
    }

    override val isEmpty: Boolean // not necessary but possible
        get() = super.isEmpty

}

class Customer {

}

interface Interface1 {
    fun funA() {
        println("Fun a from interface1")
    }
}

interface Interface2 {
    fun funA() {
        println("Fun a from interface2")
    }
}

class Class1And2 : Interface1, Interface2 {
    //    override fun funA() {
//        println("override funA")
//    }
//
    override fun funA() {
        super<Interface2>.funA()
        super<Interface1>.funA()
    }
}

fun main() {
    var class1And2 = Class1And2()
    class1And2.funA()
}
