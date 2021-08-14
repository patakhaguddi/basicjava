package Basic;

import java.util.Scanner;

public class FourthProblem {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a[] = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter Number:" );
            a[i] = keyboard.nextInt();

        }
        int max = 0;
        int min = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = max;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > max) {
                    max = a[j];
                }

            }
        }

        for (int k = 0; k < a.length; k++) {
            a[k] = min;

            for (int c = k + 1; c < a.length; c++) {
                if (a[k] < min) {
                    min = a[k];
                }

            }
        }
        System.out.println("Min Number : " + min);
        System.out.println("Max Number : " + max);
    }
}