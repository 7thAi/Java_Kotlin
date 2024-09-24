/*
1. Класс "Человек"
Создайте класс Person с полями name, age, gender.
Реализуйте методы для вывода информации о человеке и увеличения его возраста.
Добавьте метод для изменения имени.
 */

fun main() {
    println("Enter your name: ")
    val name = readLine() ?: ""

    println("Enter your age: ")
    val ageInput = readLine()
    val age = ageInput?.toInt() ?: 0

    println("Enter your gender: ")
    val gender = readLine() ?: ""

    val person = Person(name, age, gender)

    person.display()

    person.increaseAge()

    println("Enter new name:")
    val newName = readLine() ?: ""
    person.changeName(newName)
}

class Person (var name: String, var age: Int, var gender: String) {

    fun display() {
        println("Name: $name")
        println("Age: $age")
        println("Gender: $gender")
    }

    fun increaseAge() {
        age++
        println("Age increased by 1 year: $age")
    }

    fun changeName(newName: String) {
        name = newName
        println("New name: $name")
    }
}