fun main() {
    var sum = 0
    var count = 0

    while (true) {
        print("Digite um número inteiro positivo (ou um valor negativo para encerrar): ")
        val number = readLine()?.toIntOrNull()

        if (number == null) {
            println("Valor inválido. Por favor, insira um número inteiro válido.")
            continue
        }

        if (number < 0) {
            break
        }

        sum += number
        count++
    }

    if (count == 0) {
        println("Nenhum número positivo foi inserido.")
    } else {
        val average = sum.toDouble() / count
        println("Soma dos números positivos: $sum")
        println("Média dos números positivos: $average")
    }
}
