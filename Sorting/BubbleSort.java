import java.util.Arrays;

public class BubbleSort {
    //Time Complexity O(n^2)
    //Stable Sort Algorithm 
    
    public static void main(String[] args) {
        int[] arr = {4,2,-1,43,9,-3};
        boolean swapped;
        System.out.println(Arrays.toString(arr));

        for(int i = arr.length - 1; i >= 0; i--) {
            swapped = false;
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            //break if array is already sorted.
            if(!swapped) break;
        }

        System.out.println(Arrays.toString(arr));
    }
}
