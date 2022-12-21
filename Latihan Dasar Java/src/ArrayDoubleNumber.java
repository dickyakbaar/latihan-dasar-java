public class ArrayDoubleNumber {
    public static void main (String[] args) {
        int [] array1 = {2,3,4,5};
        int [] array2 = {1,3,5,7};
            System.out.print ("Array 1 = ");
                for (int k = 0; k<array1.length; k++){
            System.out.print (array1[k] + " ");}
            System.out.print ("\nArray 2 = ");
                for (int l = 0; l<array2.length; l++){
            System.out.print (array2[l] + " ");}
            System.out.print ("\n--------------------------------\nMenampilkan Angka Array yang sama = ");
                for (int i = 0; i<array1.length; i++){
                for (int j = 0; j<array2.length; j++){
                if (array1[i]==array2[j])
            System.out.print (array1[i] + " ");
            }
        }             
    }
}