package laços

fun intevaloInteiros(){
    var soma = 0.0
    var media = 0.0
    var c = 0

    println("Digite um numero: ")
    val n1 = readln().toInt()

    println("Digite um numero maior que $n1")
    var n2 = readln().toInt()
    while(n2 <= n1){
        System.out.flush()
        println("Digite um numero maior que $n1")
        n2 = readln().toInt()
    }

    for(i in n1..n2 step 1){
        soma += i
        c++
    }

    media = soma / c
    println("A media dos numeros presentes no intervalo de $n1...$n2 é $media")
}