package Condicionais

fun somaMaiorESegundoMaior(){
    println("Digite o numero 1: ")
    val n1 = readln().toInt()

    println("Digite o numero 2: ")
    val n2 = readln().toInt()

    println("Digite o numero 3: ")
    val n3 = readln().toInt()

    var maior = n1
    var maior2 = 0

    if (maior < n2) maior = n2
    if(maior <n3) maior = n3

    if(n1 != maior) maior2 = n1
    if(n2 != maior && n2 > maior2) maior2 = n2
    if(n3 != maior && n3 > maior2) maior2 = n3

    println("A soma dos maiores numeros é ${maior + maior2}")
}