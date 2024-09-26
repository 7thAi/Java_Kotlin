/*
3. Полиморфизм: Животные
Создайте интерфейс Animal с методом makeSound(). Реализуйте классы Dog, Cat, и Cow,
которые реализуют этот интерфейс. Продемонстрируйте полиморфизм на примере массива животных.
 */

fun main(){
    val animals: Array<Animal> = arrayOf(Dog(), Cat(), Cow())

    for (animal in animals) {
        animal.makeSound()
    }
}

interface Animal{
    fun makeSound()
}

class Dog : Animal{
    override fun makeSound() {
        println("Bark!")
    }
}

class Cat : Animal{
    override fun makeSound() {
        println("Meow!")
    }
}

class Cow : Animal{
    override fun makeSound() {
        println("Moo!")
    }
}