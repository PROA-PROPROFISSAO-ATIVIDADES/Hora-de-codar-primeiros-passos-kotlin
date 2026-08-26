package laços

fun media15A100Inclusive(){
    var c = 0
    var soma: Double = 0.0

    for(i in 15..100 step 1){
        soma += i
        c++
    }

    var media = soma / c
    println("A media dos numeros de 15 a 100 INCLUSIVE é: $media")

}