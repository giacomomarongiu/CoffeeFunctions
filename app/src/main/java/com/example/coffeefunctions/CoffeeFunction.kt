package com.example.coffeefunctions

fun main(){
    var myResult = add(num1 = 1, num2 = 2)
    println("Il risultato della somma è: $myResult")

    askDetails()
}

fun add(num1: Int, num2: Int): Int {
    val result = num1 + num2
    return result
}

// Dichiarazione
fun makeCoffee(sugarCount: Int, name: String) {
    if (sugarCount == 1) {
        println("Ecco il caffè con $sugarCount zucchero per $name")
    } else {
        println("Ecco il caffè con $sugarCount zuccheri per $name")
    }
    println("Ecco l'acqua")
    println("Mescola le due cose")
}

fun askDetails() {
    println("Per chi è?")
    val name = readln()
    println("Quanto zucchero?")
    val sugarStr = readln()
    val sugar = sugarStr.toInt()
    // Chiamate
    makeCoffee(sugarCount = sugar, name = name)
    println("Lavoro due ore")
}
