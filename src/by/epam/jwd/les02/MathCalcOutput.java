package by.epam.jwd.les02;

import java.util.Arrays;

public class MathCalcOutput {

    //выводит число типа double
    public void printDouble(String message, double a) {
        System.out.printf(message + "\t%4.1f\t\n", a);
    }

    //выводит целое число
    public void printInt(String message, int a) {
        System.out.printf(message + a);
    }

    //выводит массив типа double
    public void printArrayDouble(String message, double[] array) {
        System.out.print("\n" + message);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("\t%4.1f\t", array[i]);
        }
    }

    //выводит массив целых чисел
    public void printArrayInt(String message, int[] array) {
        System.out.println(message + Arrays.toString(array));
    }

    //выводит матрицу целых чисел
    public void printMatrixInt(String message, int[][] matrix) {
        System.out.println(message);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
