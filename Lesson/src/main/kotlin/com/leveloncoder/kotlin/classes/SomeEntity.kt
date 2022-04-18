package com.leveloncoder.kotlin.classes

import com.leveloncoder.kotlin.interfaces.MyInterface

open class SomeEntity : MyInterface {

    override fun eat(name: String) {
        println("$name eating")
    }

    override fun sleep(name: String) {
        println("$name sleeping")
    }
}