package WhileLoop;
import java.util.Scanner;

public class DigitalTasbih {
    public static void main(String[] args) {
        int sum=0;
//        char ch;
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.print("Please enter");
        do{
            int num=sc.nextInt();
            sum+=num;
            System.out.println(sum);

        }
        while(ch!=0);
    }
}
