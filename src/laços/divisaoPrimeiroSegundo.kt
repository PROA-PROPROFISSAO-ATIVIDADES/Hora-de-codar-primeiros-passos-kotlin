package laços

fun divisaoPrimeiroSegundo(){
    println("Digite um numero")
    val n1 = readln().toDouble()

    println("Digite um numero maior que 0")
    var n2 = readln().toDouble()
    while (n2 <= 0){
        System.out.flush()
        println("Digite um numero maior 0")
        n2 = readln().toDouble()
    }

    val div: Double = n1/n2
    println("A divisão de $n1 por $n2 é ${div}")

}