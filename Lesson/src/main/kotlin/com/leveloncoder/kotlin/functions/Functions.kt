package com.leveloncoder.kotlin.functions

fun main() {
    printSome("Lev")
    resultedNumbers(13, 5)
}

fun printSome(name: String) : String {
    println("$name hello")
    return name
}

// Don't Understand resultedNumbers function

fun resultedNumbers(x: Int, y: Int): Int {
    return x + y
}
