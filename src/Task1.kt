fun main() {
    // 1. Просим пользователя ввести число
    println("Введите целое положительное число:")
    val input = readln()   // читаем строку

    // 2. Берём первый символ и последний символ
    val firstChar = input.first()      // первый символ
    val lastChar = input.last()        // последний символ

    // 3. Превращаем символы в цифры
    val firstDigit = firstChar.digitToInt()
    val lastDigit = lastChar.digitToInt()

    // 4. Суммируем
    val sum = firstDigit + lastDigit

    // 5. Выводим результат
    println("Сумма первой и последней цифры: $sum")
}