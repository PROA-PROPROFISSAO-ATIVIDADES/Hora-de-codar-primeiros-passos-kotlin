package Condicionais

fun menoresQue72(){
    var soma = 0

    println("Digite o numero 1: ")
    val n1 = readln().toInt()
    if (n1 < 72) soma += n1

    println("Digite o numero 2: ")
    val n2 = readln().toInt()
    if (n2 < 72) soma += n2

    println("Digite o numero 3: ")
    val n3 = readln().toInt()
    if (n3 < 72) soma += n3

    println("Digite o numero 4: ")
    val n4 = readln().toInt()
    if (n4 < 72) soma += n4

    println("Digite o numero 5: ")
    val n5 = readln().toInt()
    if (n5 < 72) soma += n5

    println("Digite o numero 6: ")
    val n6 = readln().toInt()
    if (n6 < 72) soma += n6

    println("A soma dos números menores que 72 é: $soma")
}
