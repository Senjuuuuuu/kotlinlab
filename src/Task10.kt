open class Vehicle {
    open val speed: Int = 0
    open val name: String = "Транспорт"

    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    open fun stop() {
        println("$name остановился")
    }
}

class Boat : Vehicle() {
    override val speed: Int = 30
    override val name: String = "Лодка"

    override fun start() {
        println("$name отчалила от причала со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name причалила к берегу")
    }
}

class Plane : Vehicle() {
    override val speed: Int = 800
    override val name: String = "Самолёт"

    override fun start() {
        println("$name взлетел, скорость $speed км/ч")
    }

    override fun stop() {
        println("$name приземлился")
    }
}

class Tank : Vehicle() {
    override val speed: Int = 50
    override val name: String = "Танк"

    override fun start() {
        println("$name поехал по полю, скорость $speed км/ч")
    }

    override fun stop() {
        println("$name остановился на позиции")
    }
}

fun main() {
    val vehicles = listOf(Boat(), Plane(), Tank())
    for (v in vehicles) {
        v.start()
        v.stop()
        println("---")
    }
}