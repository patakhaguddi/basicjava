package Array;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int l = arr.length;
        Arrays.sort(arr);
        System.out.println("Second Highest Number: "+arr[l-2]);
    }
}
