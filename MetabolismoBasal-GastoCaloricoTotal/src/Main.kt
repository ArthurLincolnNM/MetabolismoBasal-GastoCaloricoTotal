fun taxaHomens(idade: Int, altura: Double, peso: Double): Double {
    val calculo = (10 * peso) + (6.25 * altura) - (5 * idade) + 5
    return calculo
}

fun taxaMulheres(idade: Int, altura: Double, peso: Double): Double {
    val calculo = (10 * peso) + (6.25 * altura) - (5 * idade) - 161
    return calculo
}

fun calculaGCT(taxa: Double, opcao: Int): Any {
    val gct = when (opcao) {
        1 -> taxa * 1.2
        2 -> taxa * 1.375
        3 -> taxa * 1.55
        4 -> taxa * 1.725
        5 -> taxa * 1.9
        else -> "Valor de sedentarismo inválido!"
    }
    return gct
}


fun main() {
    println("- Cálculo de taxa de metabolismo basal e gasto calório total -")

    println("Você é homem ou mulher? (H / M)")
    val sexo = readln().toCharArray()[0]
    println("Qual a sua idade?")
    val idade = readln().toInt()
    println("Qual a sua altura?")
    val altura = readln().toDouble()
    println("Qual o seu peso? (em Kg)")
    val peso = readln().toDouble()

    println("Digite um número para o seu nível de sedentarismo:")
    println("1 - Sedentário (sem exercícios)")
    println("2 - Levemente ativo (exercício leve 1–3x/semana)")
    println("3 - Moderadamente ativo (3–5x/semana)")
    println("4 - Muito ativo (6–7x/semana)")
    println("5 - Extremamente ativo (2x/dia ou atleta)")
    val opcao = readln().toInt()
    val taxa: Double


    if(sexo == 'h' || sexo == 'H') {
        taxa = taxaHomens(idade, altura, peso)
        println("A sua taxa de metabolismo basal é $taxa")
        println("Seu gasto calórico total é ${calculaGCT(taxa, opcao)}")
    } else if (sexo == 'm' || sexo == 'M') {
        taxa = taxaMulheres(idade, altura, peso)
        println("A sua taxa de metabolismo basal é $taxa")
        println("Seu gasto calórico total é ${calculaGCT(taxa, opcao)}")
    } else {
        ("Opcão de sexo invalida!")
    }
}