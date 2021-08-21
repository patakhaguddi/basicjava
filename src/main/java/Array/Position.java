package Array;

public class Position {
    public static void main(String[] args) {
        int[] numbers = {10,5,2,3,2,7,7,15,10};
        int element = 7;
        int index = -1;

        int i = 0;
        while(i < numbers.length) {
            if(numbers[i] == element)
            {
                index = i;
                break;
            }
            i++;
        }

        System.out.println("Index of "+element+" is : "+index);
    }
}
