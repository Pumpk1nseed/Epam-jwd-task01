package by.epam.jwd.les02;

import java.util.Arrays;

public class MathCalcOutput {

    //выводит число типа double
    public void printDouble(double a) {
        System.out.printf("Значение выражения равно" + "\t%4.1f\t\n", a);
    }

    //выводит целое число
    public void printInt(int a) {
        System.out.printf("Значение выражения равно " + a);
    }

    //выводит массив типа double
    public void printArrayDouble(double[] array) {
        System.out.println(Arrays.toString(array));
    }

    //выводит массив целых чисел
    public void printArrayInt(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    //выводит матрицу целых чисел
    public void printMatrixInt(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
