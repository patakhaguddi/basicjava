package WhileLoop;
import java.util.Scanner;

public class Sharee {
    public static void main(String[] args) {
        String str = "1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk.";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = (str.split(" "));
        double sharee_price = Double.parseDouble(arr[0]);
        double shirt = Double.parseDouble(arr[1]);
        double pant = Double.parseDouble(arr[2]);
        double total = sharee_price + shirt + pant;
        System.out.println("Total price " + total);

    }


}

