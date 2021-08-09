package homework1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число:");
        int number2 = scanner.nextInt();
        if (number1 == number2) {
            System.out.println("Первое и второе число равны");
        }
        if (number1 < 10 && number2 < 10) {
            if ((number1 + 1) == number2 || (number1 - 1) == number2) {
                System.out.println("Первое и второе число находятся рядом");
            } else {
                System.out.println("Первое и второе число находятся далеко друг от друга ");
            }
        }
        double rezaltOfDel = (double) number2 / number1;
        System.out.println("Второе число составляет " + rezaltOfDel*100 + " процентов от первого");
        if (rezaltOfDel > 0.9 && rezaltOfDel < 1.1) {
            System.out.println("Первое и второе число находятся рядом");
        } else {
            System.out.println("Первое и второе число находятся далеко друг от друга ");
        }
    }
}
