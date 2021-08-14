package Basic;

import java.util.Scanner;

public class FirstProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Set your name: ");
        String name = input.next();
        System.out.print("Set your university name: ");
        String university = input.next();
        System.out.println();
        System.out.println("Hello, I am "+name+". I passed from "+university+".");
    }
}
