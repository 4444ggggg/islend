package island.animals

class Bear : Animal(
    weight = 300.0,
    maxWeight = 500.0,
    maxSpeed = 2,
    maxFood = 15.0,
    icon = "🐻"
) {
    override fun eat() {
        println("$icon Медведь ловит рыбу")
        currentFood += 5.0
    }

    override fun move() {
        println("$icon Идёт вразвалочку")
    }

    override fun reproduce() {
        println("$icon Спорит с медведицей, кто главный")
    }
}