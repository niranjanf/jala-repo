package Arrays;

import edu.emory.mathcs.backport.java.util.Arrays;

public class Reverse {
	static void reverseArray(int[] arr) {
      
        int[] r_arr = new int[arr.length];
        //
        int j = arr.length;
        for (int i : arr) {
            r_arr[j - 1] = i;
            j = j - 1;
        }
        System.out.println("Reversed Array  : r_arr = " + Arrays.toString(r_arr));
    }

    public static void main(String[] args) {
       
        int[] my_arr = {11, 22, 33, 44, 55};
       
        System.out.println("Original Array : my_arr = " + Arrays.toString(my_arr));
       
        reverseArray(my_arr);
    }
}
