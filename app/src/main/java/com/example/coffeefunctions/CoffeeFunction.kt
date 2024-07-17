package com.example.coffeefunctions

fun main(){
    // Chiamate
    makeCoffee(sugarCount = 1, name = "Giacomo")
    println("Lavoro due ore")
    makeCoffee(sugarCount = 3, name = "Ciccio")
    makeCoffee(sugarCount = 0, name = "Cacca")
}

// Dichiarazione
fun makeCoffee(sugarCount : Int, name : String){
    if (sugarCount == 1){
        println("Ecco il caffè con $sugarCount zucchero per $name")
    } else {
        println("Ecco il caffè con $sugarCount zuccheri per $name")
    }
    println("Ecco l'acqua")
    println("Mescola le due cose")
}
