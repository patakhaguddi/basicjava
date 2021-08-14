package Conditional;
import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            double summation;

            System.out.println("Generate random numbers ");
            double randomNumber1 = Math.random();
            double randomNumber2 = Math.random();
            double sum = randomNumber1 + randomNumber2;

            System.out.println("What is the sum of " + randomNumber1 + "and" + randomNumber2);
            summation = input.nextDouble();

            if (summation == sum) {
                System.out.println("Answer is correct");
            } else {
                System.out.println("Point: 0");
            }
        }
    }
}
