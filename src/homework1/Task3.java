package homework1;

public class Task3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 56;
        if (a > b && a > c) {
            System.out.println("Максимальное число: " + a);
        } else {
            if (c > b && c > a) {
                System.out.println("Максимальное число:" + c);
            } else {
                System.out.println("Максимальное число:" + b);
            }
        }
        if (a < b && a < c) {
            System.out.println("Минимальное число: " + a);
        } else {
            if (c < b && c < a) {
                System.out.println("Минимальное число:" + c);
            } else {
                System.out.println("Минимальное число:" + b);
            }
        }
        System.out.println("Среднее арифметическое трех чисел равно " + (double) ((a + b + c) / 3));
    }
}
