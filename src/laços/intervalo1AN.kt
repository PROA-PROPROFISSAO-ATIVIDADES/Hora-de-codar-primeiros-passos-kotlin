package laços

fun intervalo1AN(){
    println("Digite um numero: ")
    var n = readln().toInt()
    while (n <= 0){
        System.out.flush()
        println("Digite um numero > 0")
        n = readln().toInt()
    }

    for(i in 1..n){
        println(i)
    }
}