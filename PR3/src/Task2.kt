/*
2. Наследование: Класс "Работник" и "Менеджер"
Создайте класс Worker, который наследуется от класса Person, и добавьте поле salary.
Создайте класс Manager, который наследует от Worker и добавляет поле для подчиненных сотрудников.
 */

open class Worker(name: String, age: Int, gender: String, val salary: Int) : Person(name, age, gender)

class Manager(name: String, age: Int, gender: String, salary: Int, val subordinate: String) : Worker(name, age, gender, salary)