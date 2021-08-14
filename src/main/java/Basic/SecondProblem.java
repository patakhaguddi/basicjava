package Basic;

import java.util.Scanner;

public class SecondProblem {
    public static void main(String[] args){
        // Get the double value
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Double type value: ");
        double data = keyboard.nextDouble();

        // convert into int
        int value = (int)data;

        // print the int value
        System.out.println(value);
    }
}
