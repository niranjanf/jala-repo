package Arrays;

public class calculateAvg {

	static void average(int[] arr) {
        int sum = 0;
       
        for (int i : arr) {
           
            sum = sum + i;
        }
       
        int average = sum / arr.length;
       
        System.out.print("The Average value of array is " + average);
    }

    public static void main(String[] args) {
    
        int[] arr = {7, 8, 7, 9, 3};
        
        average(arr);
    }
}
