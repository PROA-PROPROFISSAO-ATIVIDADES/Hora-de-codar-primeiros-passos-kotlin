package Condicionais

fun media6Numeros() {
    println("Digite o numero 1: ")
    val n1 = readln().toDouble()

    println("Digite o numero 2: ")
    val n2 = readln().toDouble()

    println("Digite o numero 3: ")
    val n3 = readln().toDouble()

    println("Digite o numero 4: ")
    val n4 = readln().toDouble()

    println("Digite o numero 5: ")
    val n5 = readln().toDouble()

    println("Digite o numero 6: ")
    val n6 = readln().toDouble()

    val media: Double = (n1 + n2 + n3 + n4 + n5 + n6) / 6
    println("$n1 + $n2 + $n3 + $n4 + $n5 + $n6")
    println("A media dos numeros é: $media")
}