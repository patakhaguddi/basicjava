package Basic;

import java.util.Scanner;

public class FifthProblem {
    public static void main(String args[]) {

        Double a;
        Double b;
        Double sum;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        a = sc.nextDouble();

        System.out.print("Enter another number: ");
        b = sc.nextDouble();

        sum = a+b;

        Double square = Math.pow(sum, 2);
        System.out.println("Square of (a+b)^2 is: "+ square);
    }
}
