fun main() {
    val array = arrayOf(1, 5, 2, 7, 3, 8, 4)

    println("Элементы, которые больше соседей (forEachIndexed):")
    array.forEachIndexed { index, value ->
        if (index in 1 until array.size - 1) {
            if (value > array[index - 1] && value > array[index + 1]) {
                println(value)
            }
        }
    }
}