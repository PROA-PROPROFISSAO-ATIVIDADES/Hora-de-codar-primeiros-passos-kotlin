package laços

fun divisaoPrimeiroSegundo(){
    println("Digite um numero")
    val n1 = readln().toInt()

    println("Digite um numero maior que 0")
    var n2 = readln().toInt()
    while (n2 <= 0){
        System.out.flush()
        println("Digite um numero maior 0")
        n2 = readln().toInt()
    }

    println("A divisão de $n1 por $n2 é ${n1/n2}")

}