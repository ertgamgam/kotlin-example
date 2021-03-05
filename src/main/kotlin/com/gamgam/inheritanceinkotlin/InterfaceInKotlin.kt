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

//===============

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

//===============

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

class GenericRepository<T> : Repository<T> {
    override fun getById(id: Int): T {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<T> {
        TODO("Not yet implemented")
    }
}

class CustomerGenericRepository : Repository<Customer> {
    override fun getById(id: Int): Customer {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<Customer> {
        TODO("Not yet implemented")
    }

}

//====

interface Repo {
    fun <T> getById(id: Int): T
    fun <T> getAll(id: Int): List<T>
}

class MyRepo : Repo {
    override fun <T> getById(id: Int): T {
        TODO("Not yet implemented")
    }

    override fun <T> getAll(id: Int): List<T> {
        TODO("Not yet implemented")
    }

}

fun main() {
    val class1And2 = Class1And2()
    class1And2.funA()


    println("\n\n")
}
