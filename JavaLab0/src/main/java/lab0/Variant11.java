package lab0;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Variant11 {

    // Метод для перевороту числа
    public static int task1(int number) {
        if (number < 10 || number > 99) {
            throw new IllegalArgumentException("Number must be two digits.");
        }
        int tens = number / 10;
        int ones = number % 10;
        return ones * 10 + tens;
    }

    // Метод для перевірки, чи обидва числа непарні
    public boolean task2(int a, int b) {
        return (a % 2 != 0) && (b % 2 != 0);
    }

    // Метод для порівняння двох чисел та виведення у порядку спадання
    public String task3(int a, int b) {
        if (a > b) {
            return a + " " + b;
        } else if (b > a) {
            return b + " " + a;
        } else {
            return a + " " + b;
        }
    }

    // Метод для знаходження попередньої дати
    public static String task4(int day, int month) {
        LocalDate date = LocalDate.of(2023, month, day).minusDays(1);  // Візьмемо рік 2023 як умовний
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM");
        return date.format(formatter);
    }

    // Метод для обчислення добутку чисел від A до B
    public long task5(int a, int b) {
        long product = 1;
        for (int i = a; i <= b; i++) {
            product *= i;
        }
        return product;
    }

    // Метод для знаходження найбільшого K такого, що сума 1+2+...+K менша або дорівнює N
    public int task6(int n) {
        int k = 0;
        int sum = 0;
        while (sum <= n) {
            k++;
            sum += k;
        }
        return k - 1;
    }

    // Метод для підрахунку непарних чисел у масиві
    public int task7(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // Метод для отримання колонки з матриці
    public int[] task8(int[][] matrix, int colIndex) {
        if (colIndex < 1 || colIndex > matrix[0].length) {
            throw new IllegalArgumentException("Invalid column index.");
        }
        int[] column = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            column[i] = matrix[i][colIndex - 1];
        }
        return column;
    }
}
