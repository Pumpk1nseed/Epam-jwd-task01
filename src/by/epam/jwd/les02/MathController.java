package by.epam.jwd.les02;

public class MathController {
    public MathCalcInput input = new MathCalcInput();
    public MathCalcLogic logic = new MathCalcLogic();
    public MathCalcOutput output = new MathCalcOutput();

    /*
     *Вычислить значение выражения по формуле (все переменные принимают действительные значения):
     *((b + √(b^2 + 4ac)) / 2a) − a^3c + c^(−2)
     */
    public void task02() {
        double a = input.getDouble("a");
        double b = input.getDouble("b");
        double c = input.getDouble("c");
        double z = logic.function02(a, b, c);
        output.printDouble(z);
    }

    //Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
    public void task05() {
        double[] arr = input.createArrayRandomDouble(3, 10);
        output.printArrayDouble(arr);
        double[] newArr = logic.squareArray(arr);
        output.printArrayDouble(newArr);
    }

    //В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
    public void task08() {
        int[] arr = input.createArrayRandomIntPos();
        output.printArrayInt(arr);
        int k = input.getIntPos("натуральное число k (делитель)");
        int sum = logic.findSumOfNumMultipleK(arr, k);
        output.printInt(sum);
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
        output.printMatrixInt(matrix);
    }
}
