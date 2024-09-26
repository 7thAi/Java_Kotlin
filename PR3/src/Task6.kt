/*
6. Инкапсуляция: Банк
Создайте класс BankAccount с полями accountNumber, balance, и методами для пополнения и снятия средств.
Обеспечьте инкапсуляцию для безопасности данных счета.
 */

class BankAccount(private val accountNumber: String, private var balance: Double = 0.0) {

    // Пополнение
    fun topUp(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("The account was topped up on: $amount. New balance: $balance")
        }
        else {
            println("Amount must be positive")
        }
    }

    // Снятие со счета
    fun withdraw(amount: Double) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount
                println("$amount were withdrawn from the account. New balance: $balance")
            } else {
                println("Insufficient funds")
            }
        } else {
            println("Amount must be positive")
        }
    }
}