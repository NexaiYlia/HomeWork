package homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер дня недели: ");
        if (scanner.hasNextInt()) {
            int numberOfDay = scanner.nextInt();
            switch (numberOfDay) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
                default:
                    System.out.println("Дня недели с таким номером не существует");
            }
        } else {
            System.out.println("Извините, но это не число! Попробуйте еще раз!");
        }
    }
}
