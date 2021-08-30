package homework3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте! Введите текст для форматирования:");
        String stringToChek = scanner.nextLine();
        System.out.println("Введите слово,количество вхождений для которого необходимо посчитать:");
        String stringToLookFor = scanner.nextLine();
        String[] words = stringToChek.split(" ");
        System.out.println("Строка разделена на слова по пробелу:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        System.out.println();
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            Pattern pattern = Pattern.compile(words[i]);
            Matcher matcher = pattern.matcher(pattern);
            int count = 0;
            while(matcher.find())
                count++;
            System.out.println("Слово " + words[0] + " встречается в тексте " + counter + " раза");
            counter = 0;


        }
    }
}


