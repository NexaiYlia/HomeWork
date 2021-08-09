package homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 10;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num3 = sc.nextInt();
        if (num3 == num2) System.out.println("Введенное пользователем число равно второму заданному числу");
        if (num3 == num1) System.out.println("Введенное пользователем число равно первому заданному числу");
        if (num1 > num3) {
            System.out.println("Введенное пользователем число находится в промежутке до " + num1);
        } else if (num3 < num2 && num3 > num1) {
            System.out.println("Введенное пользователем число находится в промежутке от " + num1 + " до " + num2);
        } else if (num3 > num2) {
            System.out.println("Введенное пользователем число находится в промежутке после " + num2);
        }
    }
}
