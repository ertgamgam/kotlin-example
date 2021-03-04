package com.gamgam.classes

data class SellerKotlin(var id: Int, var name: String, var email: String) {
    override fun toString(): String {
        println("if you want that you can override default toString and other method")
        val s = "{\n  \"test\": true,\n  \"test2\": \"c\",\n  \"test4\": 1,\n  \"test_\": \"5435\"\n  \n}"
        return s
    }
}

fun main() {
    val seller1 = SellerKotlin(1, "Gamgam", "test@email.com")
    val seller2 = SellerKotlin(1, "Gamgam", "test@email.com")

    println(seller1)

    if (seller1 == seller2) {
        println("equals")
    }

    val seller3 = seller1
    println(seller3.id)
    val seller4 = seller1.copy()
    println("Seller4")
    println(seller4.id)
    println(seller4.name)

    val seller5 = seller1.copy(name = "Changed name")
    println("Seller 5")
    println(seller5.id)
    println(seller5.name)
}