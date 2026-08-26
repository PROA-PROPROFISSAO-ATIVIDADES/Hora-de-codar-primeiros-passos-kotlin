package PrimeirosPassos

fun caracteresBonus(){
    println("Escreva o seu nome: ");
    val nome = readln()
    val letras = nome.length
    val motivacao = "Quem cultiva gratidão é capaz de realizar sonhos que parecem inalcançáveis!"

    println("Olá ${nome.uppercase()} " + motivacao)
    println("Seu nome possui $letras letras")
}
