package by.epam.jwd.les02;

public class MathCalcLogic {

    //возводит в квадрат неотрицательные эелементы массива и в четвертую степень - отрицательные
    public double[] squareArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arr[i] = Math.pow(arr[i], 2);
            } else {
                arr[i] = Math.pow(arr[i], 4);
            }
        }
        return arr;
    }

    //находит сумму большего и меньшего из трех чисел
    public double findSumOfMaxMin(double a, double b, double c) {
        double min = Math.min(Math.min(a, b), c);
        double max = Math.max(Math.max(a, b), c);
        double sum = min + max;
        return sum;
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
     *(n n-1 ... 1)
     *(1  2 ... n)
     *(n n-1 ... 1)
     *(...       )
     */
    public int[][] createSquareMatrix(int m) {
        int[][] matrix = new int[m][m];
        for (int i = 0; i < matrix.length; i = i+2) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j + 1;
                matrix[i + 1][j] = matrix[i].length - j;
            }
        }
        return matrix;
    }
}
