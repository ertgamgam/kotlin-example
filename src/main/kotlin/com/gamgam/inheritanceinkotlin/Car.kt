package com.gamgam.inheritanceinkotlin

open class Car {             // class Car:Any() { //
    open fun validate() {// add open to method when you need override it
        println("[Car] validate method")
    }

    constructor (value: Int) {
        println("[Car] value = $value")
    }

}

open class Audi(private val value: Int, private val value2: Int) :
    Car(value) {  //In kotlin all types default final. So we need to add open
    final override fun validate() { //when you add final anymore it is not possible that override it
        println("[Audi] override validate method")
    }

    init {
        println("[Audi] init. Value2 = $value2")
    }

    constructor(value: Int) : this(10, 20) {
        println("[Audi] constructor value = $value")
    }
}

class A3(private val value: Int) : Audi(10) {  //In kotlin all types default final. So we need to add open
//    override fun validate() {
//        println("override validate method")
//    }

    init {
        println("[A3] init value = $value")
    }

    constructor() : this(-1) {
        println("[A3] empty constructor")
    }


}

data class Mercedes(val value: Int) : Car(500) {
    fun speedUp() {
        super.validate()
        println("speed up $value")
    }
}

fun main() {
    A3()
    println("\n\n\n")
    A3(value = 234)


    println("\n\n\n")
    val mercedes = Mercedes(324)
    mercedes.speedUp()
}


