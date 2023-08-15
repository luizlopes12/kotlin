// main é o método/função que indica o início da execução do programa
// fun main(){

// }

// O string args é o argumento da função main que recebe dados de fora da execução do programa
// fun main(args: array <String>){

// }

fun main(){
    var nome = "Luiz"
    // nome = 10 - Irá dar erro de Inferência de tipo
    val valor : Int = 10 // val é uma constante que não pode ser alterada
    // valor = 20 - Irá dar erro de Inferência de tipo, pois valor é uma constante
    println("Olá $nome")
    
    val valor2 : Float = 10.3f

    // Declarando funções	
fun falar(): Int{
    println("Olá")
    return 2
}
println(falar())

fun somar(a: Int, b: Int): Int{
    return a + b
}
}