package WhileLoop;
import java.util.Scanner;

public class DigitalTasbih {
    public static void main(String[] args) {
        int sum=0;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter");
        do{
            sum+=sc.nextInt();
            System.out.println(sum);
            System.out.println("Continue?");
            ch=input.next().charAt(0);
        }
        while(ch!='q');
    }
}
