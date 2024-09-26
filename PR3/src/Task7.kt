/*
7. Счетчик объектов
Создайте класс Counter, который хранит количество созданных объектов данного класса.
Реализуйте статическое поле для учета количества объектов и метод для его увеличения при каждом создании объекта.
 */

class Counter() {
    companion object {
        var numberOfObjects: Int = 0

        fun incrementObjectsCount() {
            numberOfObjects ++
        }
    }
    init {
        incrementObjectsCount()
        println("Количество созданных экземпляров класса: $numberOfObjects")
    }
}