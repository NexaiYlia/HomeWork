package homework2;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        System.out.println("Ответьте на вопрос: Одно яйцо варится 3 минуты. Сколько минут будут вариться 2 яйца? Чтобы сдаться, нажмите 0");
        int minBound = 1;
        int maxBound = 7;
        int numberOfAttemp = RANDOM.nextInt(maxBound - minBound + 1) + minBound;
        switch (numberOfAttemp) {
            case 1:
                System.out.println("У вас " + numberOfAttemp + " попыткa");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("У вас " + numberOfAttemp + " попытки");
                break;
            default:
                System.out.println("У вас " + numberOfAttemp + " попыток");
        }
        for (int i = 1; i <= numberOfAttemp; i++) {
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == 0) {
                System.out.println("Никогда не сдавайся! Пока :)");
                return;
            }
            if (answer == 3) {
                System.out.println("Вы ответили правильно с " + i + " попытки");
                break;
            } else if (i != numberOfAttemp) {
                System.out.println("Вы ответили неправильно! Попробуйте еще раз!");
            } else {
                System.out.println("Вы проиграли. Попыток больше нет!");
            }
        }
    }
}
