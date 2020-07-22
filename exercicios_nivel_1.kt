fun fun main(args: Array<String>) {
    
/////////////////////////////////////////////////////////////////////////
// Exercícios de lógica de programação para Android Studio com Kotlin //
///////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////
// ----------------------- Nível 1 -----------------------------//
/////////////////////////////////////////////////////////////////


// 1 - Desenvolva um algoritmo que retorne o valor ao quadrado de um número.

//Versão sem função:
var num = 5
println(num*num)

//versão com função:
fun quadradoDe(multiplicarPorSi : Int) : Int {
    return multiplicarPorSi*multiplicarPorSi
} 

//Exemplo de uso da função quadradoDe:
var x = 5
println("O quadrado de $x é: ${quadradoDe(x)}")

//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/

// 2 - Desenvolva um algoritmo que retorne o dobro de um número:

//Versão sem função:
var num2 = 4
println(num2+num2)

//versão com função:
fun dobroDe(dobrar : Int) : Int{

    return dobrar+dobrar
}

//Exemplo de uso da função dobroDe:
var y = 5
println("O dobro de $y é: ${dobroDe(y)}")

//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/

// 3 - Desenvolva um algoritmo que retorne o antecessor e o sucessor de um número

//Versão sem função:

var antSuc = 6
println("Antecessor: ${antSuc -1} \nSucessor: ${antSuc+1}") 

//versão com função:

fun antesDepois(algumNumero : Int){
println("Antecessor: ${algumNumero -1} \nSucessor: ${algumNumero+1}")
}

//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/

// 4 - Desenvolva um algoritmo que calcule o total de dias em 7 meses, considerando que cada mês tenha 30 dias

//Versão sem função:

var diasCadaMes = 30
var meses = 7
println(diasCadaMes*meses)

//versão com função:

fun totalDeDias(qtdDias : Int, qtdMeses : Int) {
    println(qtdDias*qtdMeses)
}

//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/

//5 - Desenvolva um algoritmo que calcule a média entre cinco valores

//Versão sem função:

var valor1 = 7
var valor2 = 10
var valor3 = 9
var valor4 = 7
var valor5 = 8
var mediaDos5 = (valor1+valor2+valor3+valor4+valor5)/5
println(mediaDos5)

//versão com função:

fun mediaDe5(v1: Double, v2: Double, v3: Double, v4: Double, v5: Double){
    println((v1+v2+v3+v4+v5)/5)

}

//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/

//6 - Desenvolva um algoritmo que calcule o desconto na venda de um produto

//Versão sem função:

var valorDoProduto = 200
var porcentagemDeDesconto = 20
var valorDoDesconto = valorDoProduto*(100-porcentagemDeDesconto)/100
println("Valor com desconto: $valorDoDesconto ")

//versão com função:

fun calcularDesconto(preco: Double, porcentagemDoDesconto: Int) {
    println("Valor com desconto: ${preco*(100-porcentagemDoDesconto)/100} ")
}

//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/

}