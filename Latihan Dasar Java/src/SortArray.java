public class SortArray {
    public static void main(String[] args){   
    int[] arr = new int[] {3, 2, 4, 1, 5};
        System.out.println("Array elements before sorting:");
        for (int i: arr) {
        System.out.println(i);
        }
        System.out.println("Array elements after sorting:");
        for (int i = 0; i < arr.length; i++) {  
                for (int j = i + 1; j < arr.length; j++) {  
                    int tmp = 0;  
                    if (arr[i] > arr[j]) {  
                        tmp = arr[i];  
                        arr[i] = arr[j];  
                        arr[j] = tmp;  
                    }  
                } 
            System.out.println(arr[i]); 
        }  
    }  
}