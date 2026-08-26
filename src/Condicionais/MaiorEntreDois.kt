package Condicionais

fun maiorEntreDois(){
    println("Escreva o primeiro numero: ")
    val n1 = readln().toInt()

    println("Escreva o segundo numero: ")
    val n2 = readln().toInt()

    if (n1 > n2) println("O numero $n1 é o maior") else println("O numero $n2 é o maior numero")
}