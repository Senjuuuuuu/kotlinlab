fun main() {
    var sum = 0      // сумма введённых чисел (без нуля)
    var count = 0    // количество введённых чисел

    while (true) {
        println("Введите число (0 для выхода):")
        val input = readln()
        val number = input.toInt()

        if (number == 0) {
            break   // выходим из цикла, если ввели 0
        }

        sum += number
        count++
    }

    if (count == 0) {
        println("Не было введено ни одного числа.")
    } else {
        val average = sum.toDouble() / count
        println("Количество чисел: $count")
        println("Сумма чисел: $sum")
        println("Среднее арифметическое: $average")
    }
}