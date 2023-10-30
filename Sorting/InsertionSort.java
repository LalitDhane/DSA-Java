public class InsertionSort {
    //Time Complexity O(n^2)
    //Stable Sort Algorithm
    public static void main(String[] args) {
        int[] arr = {3,-2,5,12,-1};
        for (int num : arr) System.out.print(num+" ");
        System.out.println(); 
        for(int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int j;
            for(j = i; j > 0 && arr[j-1] > element; j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = element;
        }
        for (int num : arr) System.out.print(num+" ");
        System.out.println();
    }
}
