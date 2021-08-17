package WhileLoop;
import java.util.Scanner;

public class RangeOfPrimeNo {
    public static void main(String[] args) {

        int low = 2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a high range: ");
        int high = sc.nextInt();
        while (low < high) {
            boolean flag = false;

            for (int i = 2; i <= low / 2; ++i) {
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }

    }
