package laços

fun media6Notas(){
    var media: Double = 0.0
    for(i in 1..6){
        println("Digite a $i° nota do aluno: ")
        var n = readln().toDouble()

        while(n !in 0.0..10.0){
            println("Digite a nota $i° novamente")
            n = readln().toDouble()
        }
        media += n
    }

    media /= 6
    println("A media das notas é: $media")
}