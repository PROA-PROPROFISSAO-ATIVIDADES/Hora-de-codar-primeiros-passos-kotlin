package Condicionais

fun PrimeiroUltimoMaior(){
    println("Digite o numero 1: ")
    val n1 = readln().toInt()

    println("Digite o numero 2: ")
    val n2 = readln().toInt()

    println("Digite o numero 3: ")
    val n3 = readln().toInt()

    println("Digite o numero 4: ")
    val n4 = readln().toInt()

    var maior = n1
    if (maior < n2) maior = n2
    if(maior <n3) maior = n3
    if(maior <n4) maior = n4


    println("O primeiro numero foi $n1 e o ultimo $n4 numero é $maior")
}
