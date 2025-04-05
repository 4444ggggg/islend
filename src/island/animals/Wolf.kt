package island.animals

class Wolf : Animal(
    weight = 50.0,
    maxWeight = 50.0,
    maxSpeed = 3,
    maxFood = 8.0,
    icon = "🐺"
) {
    override fun eat() {
        println("$icon Волк ест мясо!")
        currentFood += 2.0
    }

    override fun move() {
        println("$icon Бежит со скоростью $maxSpeed клетки/ход")
    }

    override fun reproduce() {
        println("$icon Нашёл пару!")
    }
}