package Array;

public class DuplicateValues {
    public static void main(String[] args) {
        int [] arr = new int [] {10,5,2,3,2,7,7,15,10};

        System.out.println("the duplicates values: ");

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
                }
            }
        }
    }
