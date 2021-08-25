package homework2;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте! Введите число в диапозоне от 0 до 50:");
        int answerOfUser = scanner.nextInt();
        int minBound = 0;
        int maxBound = 50;
        for (int i = 1; ; i++) {
            int answerOfComp = RANDOM.nextInt(maxBound - minBound + 1) + minBound;
            if (answerOfComp == answerOfUser) {
                System.out.println("Компьютер угадал ваше число с " + i + " попытки");
                return;
            } else {
                System.out.println("Компьютер ответил неправильно. Его ответ: " + answerOfComp);
            }
        }
    }
}