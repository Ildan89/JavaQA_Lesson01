import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Введите число1: ");
        num1 = input.nextInt();
        System.out.print("Введите число2: ");
        num2 = input.nextInt();

        if (num1 + num2 >= 0) {
            System.out.println("Сумма двух введенных чисел положительная");
        } else {
            System.out.println("Сумма двух введеных чисел отрицательная");
        }
    }

    public static void printColor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int value = input.nextInt();

        System.out.print("Число соответствует цвету: ");
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Введите число1: ");
        num1 = input.nextInt();
        System.out.print("Введите число2: ");
        num2 = input.nextInt();

        if (num1 < num2) {
            System.out.println("num1 < num2");
        } else if (num1 > num2) {
            System.out.println("num1 > num2");
        } else {
            System.out.println("num1 = num2");
        }
    }

}
