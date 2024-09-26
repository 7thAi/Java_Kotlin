/*
4. Абстрактный класс "Транспорт"
Создайте абстрактный класс Transport с абстрактным методом move().
Реализуйте классы Car и Bike, которые наследуются от Transport и реализуют метод move().
 */

abstract class Transport {
    abstract fun move()
}

class Car : Transport() {
    override fun move() {
        TODO("Not yet implemented")
    }
}

class Bike : Transport() {
    override fun move() {
        TODO("Not yet implemented")
    }
}