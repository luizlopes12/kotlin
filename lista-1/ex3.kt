fun main() {
    val totalNumbers = 20
    var largest: Int? = null

    for (i in 1..totalNumbers) {
        print("Digite o $iº número inteiro: ")
        val number = readLine()?.toIntOrNull()

        if (number == null) {
            println("Valor inválido. Por favor, insira um número inteiro válido.")
            return
        }

        if (largest == null || number > largest) {
            largest = number
        }
    }

    println("O maior número é: $largest")
}
