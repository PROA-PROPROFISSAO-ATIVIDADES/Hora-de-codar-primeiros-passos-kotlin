package Condicionais

fun tipoNumero(){
    println("Escreva um numero: ")
    val n = readln().toInt()

    if(n > 0) println("O numero $n é positivo")
    else if(n < 0) println("O numero $n é negativo")
    else println("O numero $n é neutro")

}