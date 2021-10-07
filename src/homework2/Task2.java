package homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int a = scanner.nextInt();
        System.out.println("Введите номер дня:");
        int b = scanner.nextInt();
        int c = a - 1;
        if (a >= 0 && a < array.length) {
            if (b <= array[c]) {
                System.out.println("Такой день существует");
            } else {
                System.out.println("Такого дня не существует");
            }
        } else {
            System.out.println("Такого дня не существует");
        }
        if (a >= 0 && a < array.length) {
            switch (a) {
                case 1:
                    System.out.println("Введенный вами день: " + b + " января");
                    break;
                case 2:
                    System.out.println("Введенный вами день: " + b + " февраля");
                    break;
                case 3:
                    System.out.println("Введенный вами день: " + b + " марта");
                    break;
                case 4:
                    System.out.println("Введенный вами день: " + b + " апреля");
                    break;
                case 5:
                    System.out.println("Введенный вами день: " + b + " мая");
                    break;
                case 6:
                    System.out.println("Введенный вами день: " + b + " июня");
                    break;
                case 7:
                    System.out.println("Введенный вами день: " + b + " июля");
                    break;
                case 8:
                    System.out.println("Введенный вами день: " + b + " августа");
                    break;
                case 9:
                    System.out.println("Введенный вами день: " + b + " сентября");
                    break;
                case 10:
                    System.out.println("Введенный вами день: " + b + " октября");
                    break;
                case 11:
                    System.out.println("Введенный вами день: " + b + " ноября");
                    break;
                case 12:
                    System.out.println("Введенный вами день: " + b + " декабря");
                    break;
            }
        }
    }
}
