package homework2;

import java.util.Scanner;

import static java.lang.Math.min;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int sizeOfArr = scanner.nextInt();
        int[][] arr = new int[sizeOfArr][sizeOfArr];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int ii;
                int ij;
                if (i < sizeOfArr / 2) {
                    ii = Math.min(i, j);
                } else {
                    ii = Math.min(sizeOfArr - 1 - i, j);
                }
                if (j < sizeOfArr / 2) {
                    ij = Math.min(i, j);
                } else {
                    ij = Math.min(i, sizeOfArr - 1 - j);
                }
                arr[i][j] = Math.min(ii, ij);
                System.out.print(arr[i][j] + " ");
            }
           System.out.println();
        }
    }
}


