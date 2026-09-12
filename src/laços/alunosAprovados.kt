package laços

fun alunosAprovados(){
    var continuar = true

    data class Aluno (
        val nome: String,
        val n1: Double,
        val n2: Double,
        val media: Double
    )
    var alunos = arrayListOf<Aluno>()

    while (continuar){
        var resposta: String
        val nome: String
        val n1: Double
        val n2: Double
        val media: Double

        println("Digite o nome do aluno: ")
        nome = readln()

        println("Digite a 1° nota do aluno $nome: ")
        n1 = readln().toDouble()

        println("Digite a 2° nota do aluno $nome: ")
        n2 = readln().toDouble()

        media = (n1 + n2)/2
        val aluno = Aluno(nome = nome, n1 = n1, n2 = n2, media = media)
        alunos.add(aluno)

        println("Deseja adicionar outro aluno? (S ou N)")
        resposta = readln().toString()

        while(resposta != "S" && resposta != "N"){
            println("Responda com S ou N")
            resposta = readln().toString()
        }

        if (resposta == "S") { continuar = true } else { continuar = false }
    }

    var c: Int = 0
    println("Alunos cadastrados: ${alunos.size}")
    println("Alunos Aprovados: ")
    for(aluno in alunos){
        if(aluno.media >= 9.5) {
            c++
            println("---------------")
            println(aluno)
        }
    }
    println("$c alunos foram aprovados")
}