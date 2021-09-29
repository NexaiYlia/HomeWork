package homework3;

import java.util.Date;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите свое имя:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Введите свой возраст:");
        int age = sc.nextInt();
        Date date = new Date();
        System.out.printf(String.format("Здравствуй,%s! Тебе %d лет. Сегодня %td %tB %tY года %n%tH:%tM:%tS", name, age, date, date, date, date, date, date, date, date));
    }
}
