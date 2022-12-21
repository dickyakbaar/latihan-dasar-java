//Method Array

import java.util.Arrays;

public class ArraySortingNumber {
    public static void main(String[] args) {
        int Array[] = {3,2,4,1,5};
        System.out.println("Data Array sebelum diurutkan: ");
        for (int i: Array) {
        System.out.println(i); 
        }  
        System.out.println();
        Arrays.sort(Array);
        System.out.println("Data Array setelah diurutkan: ");
        for (int i: Array) {
            System.out.println(i);
        }
    }
}