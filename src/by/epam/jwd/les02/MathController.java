package by.epam.jwd.les02;

public class MathController {
    public MathCalcInput input = new MathCalcInput();
    public MathCalcLogic logic = new MathCalcLogic();
    public MathCalcOutput output = new MathCalcOutput();

    //Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
    public void task05() {
        double[] arr = input.createArrayRandomDouble(3, 10);
        output.printArrayDouble("Даны числа: ", arr);
        double[] newArr = logic.squareArray(arr);
        output.printArrayDouble("Преобразовано: ", newArr);
    }

    //Написать программу нахождения суммы большего и меньшего из трех чисел.
    public void task06() {
        double a = input.getDouble("a");
        double b = input.getDouble("b");
        double c = input.getDouble("c");
        double sum = logic.findSumOfMaxMin(a, b, c);
        output.printDouble("Сумма большего и меньшего из чисел равна ", sum);
    }

    //В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
    public void task08() {
        int[] arr = input.createArrayRandomIntPos();
        output.printArrayInt("Ваш массив: ", arr);
        int k = input.getIntPos("натуральное число k (делитель)");
        int sum = logic.findSumOfNumMultipleK(arr, k);
        output.printInt("Сумма элементов, кратных k, равна ", sum);
    }

    /*
     *Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     *(1  2 ... n)
     *(...       )
     *(n n-1 ... 1)
     */
    public void task10() {
        int m = input.getIntEvenPos("порядок квадратной матрицы (четное число)");
        int[][] matrix = logic.createSquareMatrix(m);
        output.printMatrixInt("Матрица сформирована: ", matrix);
    }
}
