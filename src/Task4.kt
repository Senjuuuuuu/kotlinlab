fun main() {
    println("Сколько простых чисел вывести?")
    val n = readln().toInt()

    var found = 0       // сколько уже нашли
    var candidate = 2   // начинаем с 2

    while (found < n) {
        var isPrime = true

        // Проверяем, делится ли candidate на что-то от 2 до candidate-1
        for (divisor in 2 until candidate) {
            if (candidate % divisor == 0) {
                isPrime = false
                break
            }
        }

        if (isPrime) {
            found++
            println("${found}-ое число: $candidate")
        }

        candidate++
    }
}