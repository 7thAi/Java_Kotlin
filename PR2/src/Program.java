import java.util.Scanner;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(IsDivide(a, b));
    }

    /*
    Напишите функцию, которая принимает два числа и возвращает максимальное из них.
    Если числа равны, выбрасывайте исключение с сообщением об ошибке.
     */
    public static int findMax(int a, int b) {
        if (a == b) {
            throw new IllegalArgumentException("Error, a = b.");
        }
        return Math.max(a, b);
    }

    /*
    Создайте функцию для деления двух чисел.
    Если делитель равен нулю, выбрасывайте ArithmeticException
    с сообщением о недопустимости деления на ноль.
     */
    public static int calc(int a, int b) {
        int num = a / b;
        if (b == 0) {
            throw new ArithmeticException();
        }
        return num;
    }

    /*
    Напишите функцию, которая принимает строку и пытается конвертировать её в целое число.
    Если строка не может быть конвертирована, выбрасывайте NumberFormatException.
     */
    public static boolean convert(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /*
    Создайте функцию, которая принимает возраст
    и выбрасывает IllegalArgumentException, если возраст меньше нуля или больше 150.
     */
    public static int age(int num) {
        if (num < 0 || num > 150) {
            throw new IllegalArgumentException();
        }
        return num;
    }

    /*
    Реализуйте функцию, которая находит корень из числа.
    Если число отрицательное, выбрасывайте IllegalArgumentException.
     */
    public static double findSqrt(int num) {
        double sqrtNum = Math.sqrt(num);
        if (sqrtNum < 0) {
            throw new IllegalArgumentException();
        }
        return sqrtNum;
    }

    /*
    Напишите функцию, которая вычисляет факториал числа.
    Если число отрицательное, выбрасывайте исключение.
     */
    public static long findFactorial(int num) {
        long res = 1;
        for (int fact = 2; fact <= num; fact++) {
            res *= fact;
        }
        if (res < 0) {
            throw new IllegalArgumentException();
        }
        return res;
    }

    /*
    Создайте функцию, которая проверяет массив на наличие нулей.
    Если в массиве есть нули, выбрасывайте исключение.
     */
    public static void findNull(int[] array) {
        for (int num : array) {
            if (num == 0) {
                throw new IllegalArgumentException();
            }
        }
    }

    /*
    Реализуйте функцию, которая возводит число в степень.
    Если степень отрицательная, выбрасывайте исключение.
     */
    public static double pow(double a, double b) {
        double res = Math.pow(a, b);
        if (b < 0) {
            throw new IllegalArgumentException();
        } else {
            return res;
        }
    }

    /*
    Напишите функцию, которая принимает строку и число символов.
    Функция должна возвращать строку, обрезанную до указанного числа символов.
    Если число символов больше длины строки, выбрасывайте исключение.
     */
    public static String cutStr(String str, int maxLength) {
        if (maxLength > str.length()) {
            throw new IllegalArgumentException();
        } else {
            return str.substring(0, maxLength);
        }
    }

    /*
    Напишите функцию, которая ищет элемент в массиве.
    Если элемент не найден, выбрасывайте исключение с сообщением об ошибке.
     */
    public static int findElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        throw new IllegalArgumentException();
    }

    /*
    Создайте функцию, которая конвертирует целое число в двоичную строку.
    Если число отрицательное, выбрасывайте исключение.
     */
    public static String ConvToBinary(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Число должно быть положительным.");
        } else {
            return Integer.toBinaryString(num);
        }
    }

    /*
    Реализуйте функцию, которая принимает два числа и проверяет,
    делится ли первое число на второе.
    Если второе число равно нулю, выбрасывайте ArithmeticException.
     */
    public static int IsDivide(int a, int b) {
        int sum = a / b;
        if (b == 0) {
            throw new ArithmeticException();
        }
        return sum;
    }

    /*
    Напишите функцию, которая возвращает элемент списка по индексу.
    Если индекс выходит за пределы списка, выбрасывайте IndexOutOfBoundsException.
     */
    public static <T> T getElement(List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("");
        } else {
            return list.get(index);
        }
    }

    /*
    Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy".
    Если формат неверен, выбрасывайте DateTimeParseException.
     */
    public static void checkDate(String dateString) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Неверный формат даты. Должен быть dd.MM.yyyy.", dateString, 0);
        }
    }

    /*
    Реализуйте функцию, которая объединяет две строки.
    Если одна из строк равна null, выбрасывайте NullPointerException.
     */
    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null.");
        } else {
            return str1 + str2;
        }
    }

    /*
    Создайте функцию, которая возвращает остаток от деления двух чисел.
    Если второе число равно нулю, выбрасывайте исключение.
     */
    public static int modulo(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        else {
            return dividend % divisor;
        }
    }

    /*
    Реализуйте функцию, которая находит квадратный корень числа.
    Если число отрицательное, выбрасывайте исключение.
     */
    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число должно быть положительным.");
        }
        else {
            return Math.sqrt(number);
        }
    }

    /*
    Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт.
    Если температура меньше абсолютного нуля, выбрасывайте исключение.
     */
    public static double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) { // Абсолютный ноль
            throw new IllegalArgumentException("Температура не может быть меньше абсолютного нуля (-273.15).");
        }
        else {
            return (celsius * 9 / 5) + 32;
        }
    }

    /*
    Создайте функцию, которая проверяет, является ли строка пустой или null.
    Если строка пустая или равна null, выбрасывайте исключение.
     */
    public static void checkStringNotEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка не может быть пустой или равной null.");
        }
    }
}