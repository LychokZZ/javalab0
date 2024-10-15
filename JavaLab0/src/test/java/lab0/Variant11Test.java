package lab0;

import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class Variant11Test {

    // Integer
    @Test
    public void testReverseDigits() {
        assertEquals(Variant11.task1(12), 21);
        assertEquals(Variant11.task1(45), 54);
        assertEquals(Variant11.task1(99), 99);
        assertEquals(Variant11.task1(10), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidInput() {
        Variant11.task1(5); // Invalid input
        Variant11.task1(123); // Invalid input
    }

    // Boolean
    @Test
    public void testBothOddTrue() {
        Variant11 checker = new Variant11();
        assertTrue(checker.task2(3, 5), "Both numbers should be odd");
    }

    @Test
    public void testBothOddFalse() {
        Variant11 checker = new Variant11();
        assertFalse(checker.task2(2, 5), "One of the numbers is even");
    }

    @Test
    public void testBothEven() {
        Variant11 checker = new Variant11();
        assertFalse(checker.task2(4, 6), "Both numbers are even");
    }

    @Test
    public void testOneOddOneEven() {
        Variant11 checker = new Variant11();
        assertFalse(checker.task2(7, 8), "One number is even");
    }

    // If
    @Test
    public void testCompareNumbers() {
        Variant11 comparator = new Variant11();

        assertEquals(comparator.task3(5, 3), "5 3");
        assertEquals(comparator.task3(2, 7), "7 2");
        assertEquals(comparator.task3(4, 4), "4 4");
    }

    // Case
    @Test
    public void testPreviousDate() {
        assertEquals(Variant11.task4(1, 3), "28.02");
        assertEquals(Variant11.task4(1, 1), "31.12");
        assertEquals(Variant11.task4(15, 6), "14.06");
        assertEquals(Variant11.task4(1, 5), "30.04");
    }

    // For
    @Test
    public void testCalculateProduct() {
        Variant11 calculator = new Variant11();

        int A1 = 1, B1 = 5;
        long expected1 = 120;
        assertEquals(calculator.task5(A1, B1), expected1);

        int A2 = 2, B2 = 4;
        long expected2 = 24;
        assertEquals(calculator.task5(A2, B2), expected2);

        int A3 = 3, B3 = 3;
        long expected3 = 3;
        assertEquals(calculator.task5(A3, B3), expected3);
    }

    // While
    @Test
    public void testFindMaxK() {
        Variant11 sqrtApprox = new Variant11();

        assertEquals(sqrtApprox.task6(16), 4);
        assertEquals(sqrtApprox.task6(17), 4);
        assertEquals(sqrtApprox.task6(25), 5);
        assertEquals(sqrtApprox.task6(1), 1);
        assertEquals(sqrtApprox.task6(0), 0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidInputWhile() {
        Variant11 sqrtApprox = new Variant11();
        sqrtApprox.task6(0); // Invalid input
    }

    // Array
    @Test
    public void testPrintOddNumbers() {
        Variant11 oddNumbers = new Variant11();
        int[] testArray = {2, 3, 5, 6, 7, 8, 9};

        int expectedCount = 4;
        int actualCount = oddNumbers.task7(testArray);

        assertEquals(actualCount, expectedCount);
    }

    // Matrix
    @Test
    public void testGetColumn() {
        Variant11 matrixColumn = new Variant11();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] expectedColumn = {2, 5, 8};
        assertEquals(matrixColumn.task8(matrix, 2), expectedColumn);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidColumnIndex() {
        Variant11 matrixColumn = new Variant11();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        matrixColumn.task8(matrix, 4); // Invalid column index
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testEmptyMatrix() {
        Variant11 matrixColumn = new Variant11();

        int[][] matrix = {};
        matrixColumn.task8(matrix, 1); // Викликаємо метод, який повинен кинути виняток
    }
}
