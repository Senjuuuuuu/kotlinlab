fun main() {
    val array = arrayOf(1, 5, 2, 7, 3, 8, 4)

    println("Элементы, которые больше соседей (while):")
    var i = 1
    while (i < array.size - 1) {
        if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
            println(array[i])
        }
        i++
    }
}