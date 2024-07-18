package com.example.coffeefunctions

class Dog (val name: String, val breed: String, var age: Int = 0) {
    init{
        //codice eseguito nel momento in cui dichiariamo un'istanza Dog
        bark(name)
    }
    fun bark(name: String){
        println("$name says Bau bau")
    }
}