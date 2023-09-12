import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();
    }

    /**
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
     * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
     * приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */

    static void task1() {
        boolean flag = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (flag) {
            System.out.print("Введите дробное число: ");
            try {
                float num = Float.parseFloat(reader.readLine());
                System.out.printf("Ваше число %f\n", num);
                flag = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Ошибка формата данных! Введите дробно число.");
            }
        }
    }

    static void task2(){
        try {
            int[] intArray = {1,2,3,4,5,6,7,8,9};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    static void task3() {
        try {
            int a = 90;
            int b = 1;
            System.out.println(a / b);
            printSum(20, 240);
            int[] arr = {1, 2, 3, 4, 5};
            arr[1] = 4;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) {
            System.out.println("Делить на ноль нельзя!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    private static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    static void task4(){
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        if (string.equals("")) {
            throw new RuntimeException("Страка пуста");

        }
        System.out.println("Вы ввели: " + string);
        scanner.close();
    }

}