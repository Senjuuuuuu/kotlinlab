import kotlin.random.Random

fun main() {
    // Загадываем число от 0 до 10
    val secret = (0..10).random()
    println("Я загадал число от 0 до 10. Попробуй угадать!")

    while (true) {
        println("Введи свой вариант:")
        val guess = readln().toInt()

        when {
            guess > secret -> println("Много")
            guess < secret -> println("Мало")
            else -> {
                println("Угадал!")
                break
            }
        }
    }
}