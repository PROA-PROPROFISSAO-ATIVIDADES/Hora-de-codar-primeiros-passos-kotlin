package Condicionais

fun mediaTeste(){
    println("Digite um numero entre 0 a 10")
    println("Digite a nota 1: ")
    val n1 = readln().toIntOrNull() ?: -1
    if(!verificaIntervalo(n1)) {
        println("Programa encerrado por nota inválida.")
        return
    }

    println("Digite a nota 2: ")
    val n2 = readln().toIntOrNull() ?: -1
    if(!verificaIntervalo(n2)) {
        println("Programa encerrado por nota inválida.")
        return
    }

    println("Digite a nota 3: ")
    val n3 = readln().toIntOrNull() ?: -1
    if(!verificaIntervalo(n3)) {
        println("Programa encerrado por nota inválida.")
        return
    }

    println("Digite a nota 4: ")
    val n4 = readln().toIntOrNull() ?: -1
    if(!verificaIntervalo(n4)) {
        println("Programa encerrado por nota inválida. (Digite um numero entre 0 a 10 na proxima vez")
        return
    }

    val media = (n1 + n2 + n3 + n4) / 4
    if(media > 5) println("Você passou no teste") else println("Tente novamente")
}

fun verificaIntervalo(n1: Int): Boolean { return n1 in 0..10 }

