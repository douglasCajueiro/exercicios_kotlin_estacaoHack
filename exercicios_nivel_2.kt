fun fun main(args: Array<String>) {
    
/////////////////////////////////////////////////////////////////////////
// Exercícios de lógica de programação para Android Studio com Kotlin //
///////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////
// ----------------------- Nível 2 -----------------------------//
/////////////////////////////////////////////////////////////////

// 1 - Desenvolva um algoritmo que determine se uma pessoa é maior de idade ou não

//Versão sem função:
var idade = "26" // Declaração da variável que recebe o valor correspondente à idade
if(idade>=18) { // Se o valor contido na variável -idade- seja maior ou igual a 18
    println("Maior de idade") // Imprime
} else { // Senão
    println("Menor de idade") // imprime
}

//versão com função:
fun maiorMenorDeIdade(idadeAtual : Int) : String { // Criação da função que recebe o parâmetro -idadeAtual-
    if (idadeAtual>=18) { // Se o valor contido na variável -idade- seja maior ou igual a 18
	    return "Maior de idade" // Retorna: "Maior de idade"
    } // Encerramento da condição Se
    else { // Senão
        return "Menor de idade" // Retorna: "Menor de idade"
} // Encerramento da condição Senão

} // Encerramento da função

println("João é ${maiorMenorDeIdade(16)}") // Exemplo de uso da função maiorMenorDeIdade()

//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/

// 2 - Desenvolva um algoritmo que identifique se um determinado número inteiro é par ou ímpar

//Versão sem função:
var parOuImpar = 32 // Declaração da variável que recebe o número a ser analisado
if(parOuImpar%2 == 0) { // Se o número contido na variável parOuImpar, ao ser dividido por 2, tiver resto zero
    println("É par") // Imprime: "É par"
} else { // Senão
    println("É ímpar") // Imprime: "É ímpar"
}

//versão com função:
fun imparOuPar(numero : Int) : String {// Função que recebe o parâmetro -numero- Inteiro, e retorna uma String
if(numero%2 == 0) { // Se o número contido na variável parOuImpar, ao ser dividido por 2, tiver resto zero
    return "par" // Retorna "par"
} else { // Senão
    return "impar" // Retorna: "impar"
}
}

// exemplo de uso da função imparOuPar:
    var x = 48
    println("O número $x é ${imparOuPar(x)}") // Chamando a função dentro de uma Template String

//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/

// 3 - Desenvolva um algoritmo que simule um sistema de login

//Versão sem função:



//versão com função:

//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/

// 4 - Desenvolva um algoritmo que calcule o IMC de uma pessoa, imprima o valor do IMC e sua classificação

//Versão sem função:
var peso = 70
var altura = 1.70
var imc = peso/(altura*altura)
println("Seu imc é ${Math.round(imc)}")

//versão com função:

fun imc(peso : Int, altura : Double) : Long {
     var imcR = peso/(altura*altura)
     
    return Math.round(imcR.toDouble())
}

//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/

// 5 - Desenvolva um algoritmo que imprima qualquer tabuada

//Versão sem função:

var num = 7 // Valor a ser gerada a Tabuada

for(i in 1..10) { // Repetição do 1 ao 10
    println("$num x $i = ${num*i}") // A cada repetição, pega o valor atual e multiplica pelo parâmetro -n- 
}

//versão com função:

fun tabuada(n : Int) { // O parâmetro -n- recebe o valor a ser gerada a tabuada 
    for(i in 1..10) { // Repetição do 1 ao 10
        println("$n x $i = ${n*i}") // A cada repetição, pega o valor atual e multiplica pelo parâmetro -n- 
    }
}

//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/

// 6 - Desenvolva um algoritmo que conte a quantidade de vogais em uma palavra

//Versão sem função:

var palavraVogal = "amor"
var contadorVogais = 0
for(letra in palavraVogal) {
    if(
        letra == 'a' ||
        letra == 'e' ||
        letra == 'i' ||
        letra == 'o' ||
        letra == 'u'){
            contadorVogais++
        }
}
println("A palavra $palavraVogal possui $contadorVogais vogais")


//Versão com função:

fun contarVogais(aPalavra : String) : Int {
    val vogais = arrayListOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var contadorVogais = 0
    for(letra in aPalavra) {
        
    	if(vogais.indexOf(letra)>=0) {
    		contadorVogais++
    	}
        
	}
    return contadorVogais
}

// Exemplo de uso da função contarVogais:
    var tal = "Amor"
    println("A palavra $tal tem ${contarVogais(tal)} vogais")

//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/
}