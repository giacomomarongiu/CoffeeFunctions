package com.example.coffeefunctions

fun main(){
    //Istanza/Oggetto di calsse Dog che viene subito eseguito
    var myDog = Dog(name = "Daisy", breed = "Pechinese", age=10)
    //askDetails()
    println("la sua razza è ${myDog.breed} e ha ${myDog.age} anni")
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

fun operations(){
    println("Inserisci un numero")
    val num1St= readln()
    val num1= num1St.toInt()
    println("Inserisci un numero")
    val num2St= readln()
    val num2= num2St.toInt()
    var myResult = divide(num1,num2)
    println("Il risultato della somma è: $myResult")
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


