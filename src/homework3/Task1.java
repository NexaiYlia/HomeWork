package homework3;

public class Task1 {
    public static void main(String[] args) {
        String string = new String();
        for (int i = 0; i < 100; i++) {
            int a = (int) (Math.random() * (1000 - 0 + 1) + 0);
            string = string + a + " ";

        }
        System.out.println(string);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            int b = (int) (Math.random() * (1000 - 0 + 1) + 0);
            stringBuilder.append(b).append(" ");
        }
        System.out.println();
        System.out.println(stringBuilder);
    }
}
