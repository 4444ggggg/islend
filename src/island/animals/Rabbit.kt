package island.animals

class Rabbit : Animal(
    weight = 2.0,
    maxWeight = 2.5,
    maxSpeed = 2,
    maxFood = 0.45,
    icon = "🐇"
) {
    override fun eat() {
        println("$icon Кролик грызёт траву")
        currentFood += 0.15
    }

    override fun move() {
        println("$icon Прыгает по полю")
    }

    override fun reproduce() {
        println("$icon Завел крольчат!")
    }
}