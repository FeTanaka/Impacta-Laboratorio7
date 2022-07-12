package br.com.impacta.laboratorio7

fun main() {
    // Array de números inteiros
    var numeros: Array<Int> = arrayOf(10, 20, 30, 40, 50)
    // Função Lamba que soma dois números
    var soma: (Int, Int) -> Int = { a, b -> a + b }
    var soma2 = { a: Int, b: Int -> a + b }
    // Chamando as funções
    solucaoComForUntil(numeros, soma)
    solucaoComForEach(numeros, soma)
    solucaoComForRange(numeros, soma)
}

fun solucaoComForUntil(arrayNumeros: Array<Int>, operacao: (Int, Int) -> Int) {
    var acumulador: Int = 0

    for (i in 0 until arrayNumeros.size) {
        acumulador += arrayNumeros[i]
        println("Soma parcial: $acumulador")
    }
}

fun solucaoComForRange(arrayNumeros: Array<Int>, operacao: (Int, Int) -> Int) {
    var acumulador: Int = 0

    for (i in 0..(arrayNumeros.size - 1)) {
        acumulador += arrayNumeros[i]
        println("Soma parcial: $acumulador")
    }
}

fun solucaoComForEach(arrayNumeros: Array<Int>, operacao: (Int, Int) -> Int) {
    var acumulador: Int = 0

    arrayNumeros.forEach { numero ->
        acumulador += numero
        println("Soma parcial: $acumulador")
    }
}