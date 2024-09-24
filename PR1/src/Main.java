import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    /*
    Пользователь вводит целое число. Программа должна вывести,
    является ли это число четным или нечетным.
     */
    public static void checkEvenOdd(int num) {
        System.out.println(num + " - " + (num % 2 == 0 ? "Четное число" : "Нечетное число"));
    }

    /*
    Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.
     */
    public static void findMin(int num1, int num2, int num3) {
        int min = Math.min(num1, num2);
        min = Math.min(min, num3);
        System.out.println("Минимальное число: " + min);
    }

    /*
    Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10).
     */
    public static void multiplicationTable() {
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    /*
    Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.
     */
    public static void sumOfNumbers(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Сумма чисел от 1 до " + num + ": " + sum);
    }

    /*
    Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.
     */
    public static void fibonacciSequence(int n) {
        int a = 0;
        int b = 1;
        int temp;
        System.out.print("Первые " + n + " чисел Фибоначчи: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }

    /*
    Пользователь вводит целое число.
    Программа должна проверить, является ли это число простым (делится только на 1 и само на себя).
     */
    public static void checkPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " - не простое число");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " - не простое число");
                return;
            }
        }
        System.out.println(num + " - простое число");
    }

    /*
    Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.
     */
    public static void reverseNumbers(int num) {
        System.out.print("Число " + num + " в обратном порядке: ");
        System.out.println(new StringBuilder(Integer.toString(num)).reverse().toString());
    }

    /*
    Пользователь вводит два целых числа A и B.
    Программа должна найти сумму всех четных чисел в диапазоне от A до B (включительно).
     */
    public static void sumOfEvenNumbers(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма четных чисел в диапазоне от " + a + " до " + b + ": " + sum);
    }

    /*
    Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.
     */
    public static void reverseString(String str) {
        String reversedString = new StringBuilder(str).reverse().toString();
        System.out.println("Обратная строка: " + reversedString);
    }

    /*
    Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.
     */
    public static void countDigits(int num) {
        int count = 0;
        if (num == 0) {
            count = 1; // Обработка случая, когда число равно 0
        } else {
            while (num != 0) {
                num /= 10;
                count++;
            }
        }
        System.out.println("Количество цифр в числе: " + count);
    }

    /*
    Пользователь вводит целое число N. Программа должна вычислить факториал этого числа (N!).
     */
    public static void factorial(int num) {
        if (num < 0) {
            System.out.println("Факториал не определен для отрицательных чисел.");
            return;
        }
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Факториал " + num + "! равен: " + factorial);
    }

    /*
    Пользователь вводит целое число. Программа должна найти сумму всех цифр этого числа.
     */
    public static void sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {

            sum += num % 10;

            num /= 10;
        }
        System.out.println("Сумма цифр числа: " + sum);
    }

    /*
    Пользователь вводит строку. Программа должна проверить,
    является ли эта строка палиндромом (читается одинаково слева направо и справа налево).
     */
    public static void checkPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s", "");
        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome ? "Строка является палиндромом." : "Строка не является палиндромом.");

    }

    /*
    Пользователь вводит размер массива и элементы массива.
    Программа должна найти и вывести максимальное число в массиве.
     */
    public static void findMax(int[] array) {
        if (array.length == 0) {
            System.out.println("Массив пуст.");
            return;
        }
        System.out.println("Максимальное число в массиве: " + Arrays.stream(array).max().getAsInt());
    }

    /*
    Пользователь вводит размер массива и его элементы.
    Программа должна вычислить и вывести сумму всех элементов массива.
     */
    public static void sumOfArray(int[] array) {
        if (array.length == 0) {
            System.out.println("Массив пуст.");
            return;
        }
        System.out.println("Сумма всех элементов массива: " + Arrays.stream(array).sum());
    }

    /*
    Пользователь вводит размер массива и его элементы.
    Программа должна подсчитать и вывести количество положительных и отрицательных чисел в массиве.
     */
    public static void countPositiveNegative(int[] array) {
        int positiveCount = 0;
        int negativeCount = 0;
        for (int j : array) {
            if (j > 0) {
                positiveCount++;
            } else if (j < 0) {
                negativeCount++;
            }
        }
        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
    }

    /*
    Пользователь вводит два целых числа A и B.
    Программа должна вывести все простые числа в этом диапазоне (включительно).
     */
    public static void printPrimes(int num1, int num2) {
        if (num1 < 2 && num2 < 2) {
            System.out.println("Простых чисел нет!");
            return;
        }
        if (num1 < 2) {
            num1 = 2; // Начинаем с 2, так как 1 не простое число
        }
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
    Пользователь вводит строку.
    Программа должна подсчитать и вывести количество гласных и согласных букв в этой строке.
     */
    public static void countVowelsConsonants(String str) {
        str = str.toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y' ||
                        ch == 'а' || ch == 'о' || ch == 'е' || ch == 'ё' || ch == 'и' ||
                        ch == 'ю' || ch == 'у' || ch == 'э' || ch == 'ы' || ch == 'я') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Количество гласных: " + vowelCount);
        System.out.println("Количество согласных: " + consonantCount);
    }

    /*
    Пользователь вводит строку, состоящую из нескольких слов.
    Программа должна вывести слова в обратном порядке.
     */
    public static void reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }
        System.out.println(reversedString.toString().trim());
    }

    /*
    Пользователь вводит целое число. Программа должна проверить,
    является ли это число числом Армстронга
    (сумма цифр в степени, равной количеству цифр, равна самому числу).
     */
    public static void checkArmstrong(int num) {
        int originalNum = num;
        int digitsCount = 0;
        int sum = 0;
        // Подсчет количества цифр
        while (num > 0) {
            digitsCount++;
            num /= 10;
        }
        num = originalNum; // Восстановление исходного числа
        // Вычисление суммы цифр в степени
        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digitsCount);
            num /= 10;
        }
        System.out.println(sum == originalNum ? (originalNum + " - число Армстронга.") : (originalNum + " - не число Армстронга."));
    }
}