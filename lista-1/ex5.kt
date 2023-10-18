fun main() {
    var largest: Int? = null

    while (true) {
        print("Digite um número inteiro (ou um valor negativo para encerrar): ")
        val number = readLine()?.toIntOrNull()

        if (number == null) {
            println("Valor inválido. Por favor, insira um número inteiro válido.")
            continue
        }

        if (number < 0) {
            break
        }

        if (largest == null || number > largest) {
            largest = number
        }
    }

    if (largest == null) {
        println("Nenhum número foi inserido.")
    } else {
        println("O maior número inserido foi: $largest")
    }
}
