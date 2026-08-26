package Condicionais

import java.time.LocalDate
import java.util.Date

fun idadeVoto(){
    println("Digite o ano em que você nasceu")
    val ano = readln().toInt()
    val anoAtual = LocalDate.now().year

    val idade = anoAtual - ano
    if(idade >= 18){
        println("Com $idade anos você já deve votar")
    } else {
        println("Com $idade anos você ainda não pode votar")
    }
}