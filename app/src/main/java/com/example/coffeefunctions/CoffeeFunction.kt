package com.example.coffeefunctions

fun main(){

    println("Inserisci un numero")
    val num1St= readln()
    val num1= num1St.toInt()
    println("Inserisci un numero")
    val num2St= readln()
    val num2= num2St.toInt()
    var myResult = divide(num1,num2)
    println("Il risultato della somma è: $myResult")

    askDetails()
}

fun divide(num1: Int, num2: Int): Double {
    val result = num1 / num2.toDouble()
    return result
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
