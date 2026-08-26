package laços

fun numerosdentroIntervalo(){
    var c: Int = 0
    for(i in 1..10){
        println("Digite o $i° numero")
        val n1 = readln().toInt()

        if(n1 >= 24 && n1 <= 42) c++
    }

    println("$c numeros estão dentro do intervalo e ${10 - c} estão fora")
}