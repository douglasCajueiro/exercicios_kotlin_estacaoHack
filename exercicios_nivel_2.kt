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
var peso = 70 // Variável que recebe o peso
var altura = 1.70 // Variável que recebe a altura
var imc = peso/(altura*altura) // Declaração da variável que recebe o imc, com base nas variáveis peso e altura
println("Seu imc é ${Math.round(imc)}") // Imprime o valor do imc, arredondando

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

var palavraVogal = "amor" // Declaração de uma variável tipo String, contendo a palavra a ser analisada
var contadorVogais = 0 // Declaração de um contador para acumular o total de vogais
for(letra in palavraVogal) { // Para cada letra da String contida na variável palavraVogal
    if( // Se
        letra == 'a' || // letra for igual a 'a' ou
        letra == 'e' || // letra for igual a 'e' ou
        letra == 'i' || // letra for igual a 'i' ou
        letra == 'o' || // letra for igual a 'o' ou
        letra == 'u'){  // letra for igual a 'u'
            contadorVogais++ // O contador receberá o valor atual, mais 1
        }

        /* Quando fazemos um for para percorrer uma palavra, ele cria uma variável do tipo caractere (Char),
        que nosso caso foi definida com o nome de -letra-, portanto, precisamos fazer a comparação
        utilizando aspas simples, e não duplas.
        
        Ex.: (letra == 'a') 'a' é um Char
             (letra == "a") "a" é uma String

        Não é possível comparar dois valores de tipos diferentes */
}
println("A palavra $palavraVogal possui $contadorVogais vogais") // Imprime a palavra e a quantidade de vogais


//Versão com função:

fun contarVogais(aPalavra : String) : Int { // Função que recebe como parâmetro a palavra a ser analisada
    val vogais = arrayListOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    // Declaração de um arraycom as vogais, maiúsculas e minúsculas
    
    var contadorVogais = 0 // Contador que receberá o total de vogais
    for(letra in aPalavra) { // A cada letra da palavra
        
    	if(vogais.indexOf(letra)>=0) { // O indexOf, retornará a posição da letra no array -vogais-
        // Caso não exista a letra no array, o indexOf retornará -1, caso ele seja igual ou maior que 0, é vogal
    		contadorVogais++ // e o contador receberá +1
    	}
        
	}
    return contadorVogais // Retorna o total de vogais
}

// Exemplo de uso da função contarVogais:
    var tal = "Amor"
    println("A palavra $tal tem ${contarVogais(tal)} vogais")
    /* Utilizando uma Template String para chamar a função contarVogais,
    que retornará para a String a ser impresa o valor contido na variável -tal-*/

//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/
}