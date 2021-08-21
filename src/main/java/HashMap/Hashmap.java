package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // Add keys and values (Country, City)
        map.put(1, 2);
        map.put(2, 5);
        map.put(3, 10);
        map.put(4, 20);
        map.put(5, 50);
        map.put(6, 100);
        map.put(7, 200);
        map.put(8, 500);
        map.put(9, 1000);

        System.out.println(map);
        System.out.println(map.get(1));
    }

}
