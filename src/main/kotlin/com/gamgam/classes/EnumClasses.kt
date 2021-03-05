package com.gamgam.classes

enum class Priority {
    MINOR,
    NORMAL,
    MAJOR,
    CRITICAL
}

enum class Priority2(val value: Int) {
    MINOR(-1),
    NORMAL(0),
    MAJOR(1) {
        override fun toString(): String {
            return super.toString() + " OVERRIDE";
        }
    },
    CRITICAL(10)

}

enum class City {
    MERSIN {
        override fun sayHello(): String {
            return "hello from ${this.name}"
        }
    },
    ISTANBUL {
        override fun sayHello(): String {
            return "hello from ${this.toString()}"
        }
    };

    abstract fun sayHello(): String
}

fun main() {
    val priority = Priority.NORMAL
    println(priority)

    val major = Priority2.MAJOR
    println(major.value)
    println(major.ordinal)
    println(Priority2.CRITICAL.ordinal)
    println(Priority2.MAJOR.name)
    println(Priority2.MINOR)

    println("\n\n")
    for (priorityInList in Priority.values()) {
        println(priorityInList)
    }

    val critical = Priority.valueOf("CRITICAL")
    println(critical.ordinal)

    println(Priority2.MAJOR)
    println(Priority2.MAJOR.toString())
    println(Priority2.MAJOR.name)

    println("cities")
    println(City.ISTANBUL.sayHello())
    println(City.MERSIN.sayHello())
}