package Condicionais

fun media6Numeros() {
    println("Digite o numero 1: ")
    val n1 = readln().toInt()

    println("Digite o numero 2: ")
    val n2 = readln().toInt()

    println("Digite o numero 3: ")
    val n3 = readln().toInt()

    println("Digite o numero 4: ")
    val n4 = readln().toInt()

    println("Digite o numero 5: ")
    val n5 = readln().toInt()

    println("Digite o numero 6: ")
    val n6 = readln().toInt()

    var media = (n1 + n2 + n3 + n4 + n5 + n6) / 6
    println("A media dos numeros é: $media")
}