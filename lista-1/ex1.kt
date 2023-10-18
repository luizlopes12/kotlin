fun main() {
    val numberOfDays = 30
    var totalHoursWorked = 0

    for (day in 1..numberOfDays) {
        print("Digite o número de horas trabalhadas no dia $day: ")
        val hoursWorked = readLine()?.toIntOrNull()

        if (hoursWorked == null) {
            println("Valor inválido. Por favor, insira um número válido de horas.")
            return
        }

        totalHoursWorked += hoursWorked
    }

    println("Total de horas trabalhadas em 30 dias: $totalHoursWorked horas.")
}
