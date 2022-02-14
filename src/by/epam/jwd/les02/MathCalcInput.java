package by.epam.jwd.les02;

import java.util.Scanner;
import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathCalcInput {

    @SuppressWarnings("resource")

    //ввод пользователем вещественного числа
    public double getDouble(String message) {
                System.out.println("Введите " + message);
        Scanner scan = new Scanner(System.in);
        double number;
        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Некорректный ввод!");
            System.out.print("Введите число или проверьте, чтобы дробную и целую части разделяла запятая, а не точка: ");
        }
        number = scan.nextDouble();
        return number;
    }

    //ввод пользователем натурального положительного числа
    public int getIntPos(String message) {
        System.out.println("Введите " + message);
        Scanner scan = new Scanner(System.in);
        int number;
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Некорректный ввод!");
            System.out.print("Введите натуральное число: ");
        }
        number = scan.nextInt();
        if (number > 0) {
            return number;
        } else {
            while (number <= 0) {
                System.out.println("Некорректный ввод!");
                System.out.print("Введите положительное число: ");
                while (!scan.hasNextInt()) {
                    scan.next();
                    System.out.println("Некорректный ввод!");
                    System.out.print("Введите натуральное положительное число: ");
                }
                number = scan.nextInt();
            }
            return number;
        }
    }

    //ввод пользователем четного натурального числа
    public int getIntEvenPos(String message) {
        int m = getIntPos(message);
        while (m % 2 != 0) {
            System.out.println("Число должно быть четным, попробуйте еще раз.");
            m = getIntPos(message);
        }
        return m;
    }

    //создает массив размера k и заполняет его значениями от -n до n
    public double[] createArrayRandomDouble(int k, int n) {
        Random rand = new Random();
        double[] arr = new double[k];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = round(rand.nextDouble() * n * 2 - n, 2);
        }
        return arr;
    }

    //создает массив и заполняет его случайными натуральными числами
    public int[] createArrayRandomIntPos() {
        int n = getIntPos("целое n (размер массива)");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    //округляет вещественное число до poz позиций после запятой
    public double round(double number, int poz) {
        if (poz < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(Double.toString(number));
        bd = bd.setScale(poz, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}