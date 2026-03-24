class NumberArray(private val array: IntArray) {

    fun sumPositive(): Int {
        var sum = 0
        for (element in array) {
            if (element > 0) sum += element
        }
        return sum
    }

    fun product(): Int {
        var product = 1
        for (element in array) {
            product *= element
        }
        return product
    }

    fun average(): Double {
        if (array.isEmpty()) return 0.0
        var sum = 0
        for (element in array) {
            sum += element
        }
        return sum.toDouble() / array.size
    }
}

fun main() {
    val arr = intArrayOf(1, -2, 3, -4, 5)
    val obj = NumberArray(arr)

    println("Сумма положительных: ${obj.sumPositive()}")
    println("Произведение: ${obj.product()}")
    println("Среднее арифметическое: ${obj.average()}")
}
