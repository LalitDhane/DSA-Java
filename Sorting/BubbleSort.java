public class BubbleSort {
    //Time Complexity O(n^2)
    //Stable Sort Algorithm 
    public static void main(String[] args) {
        int[] arr = {4,2,-1,43,9,-3};
        for (int num : arr) System.out.print(num+" ");
        System.out.println(); 

        for(int i = arr.length - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        for (int num : arr) System.out.print(num+" ");
        System.out.println();
    }
}
