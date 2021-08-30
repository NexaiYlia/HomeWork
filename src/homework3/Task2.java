package homework3;

public class Task2 {
    public static void main(String[] args) {
        String string = new String();
        for (int i = 0; i < 100; i++) {
            int a = (int) (Math.random() * (1000 - 0 + 1) + 0);
            string = string + a + " ";
        }
        System.out.println(string);
        System.out.println(string.replaceAll("(\\s[1-9][0-9]\\s)|(^[1-9][0-9]\\s)|(\\s[1-9][0-9]$)", " -1 "));
    }
}
