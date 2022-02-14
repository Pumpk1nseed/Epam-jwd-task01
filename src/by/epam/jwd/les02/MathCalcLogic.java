package by.epam.jwd.les02;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathCalcLogic {

    /*
     *Вычисляет значение выражения по формуле:
     *((b + √(b^2 + 4ac)) / 2a) − a^3c + c^(−2)
     */
    public double function02(double a, double b, double c) {
        double z;
        z = b + Math.sqrt(b * b + 4 * a * c);
        z /= 2 * a;
        z += Math.pow(b, -2) - Math.pow(a, 3) * c;
        return z;
    }

    //возводит в квадрат неотрицательные эелементы массива и в четвертую степень - отрицательные
    public double[] squareArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[i] = round(Math.pow(arr[i], 2), 2);
            } else {
                arr[i] = round(Math.pow(arr[i], 4), 2);
            }
        }
        return arr;
    }

    //находит сумму элементов массива, которые кратны данному К
    public int findSumOfNumMultipleK(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % k == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    /*
     *заполняет квадратную матрицу порядка n по заданному образцу(n - четное):
     *(1  2 ... n)
     *(...       )
     *(n n-1 ... 1)
     */
    public int[][] createSquareMatrix(int m) {
        int[][] matrix = new int[m][m];
        for (int i = 0; i < matrix.length; i += 2) {
            int k = 1;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = k;
                k++;
            }
        }

        for (int i = 1; i < matrix.length; i += 2) {
            int k = matrix.length;
            ;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = k;
                k--;
            }
        }
        return matrix;
    }

    //округляет вещественное число до poz позиций после запятой
    public double round(double number, int poz) {
        if (poz < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(Double.toString(number));
        bd = bd.setScale(poz, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
