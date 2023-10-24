class SelectionSort {
    //Time Complexity O(n^2)
    //UnStable Sort Algorithm 
	public static void main(String[] args) {
		int[] arr = {2,6,-1,9,-3, 8, 3};
		
		for(int num : arr) System.out.print(num+" ");
		System.out.println();

		for(int i = arr.length - 1; i >= 0; i--) {
			int maxIndex = 0;
			for(int j = 0; j <= i; j++) {
				if(arr[maxIndex] < arr[j]) maxIndex = j;
			}
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}

		for(int num : arr) System.out.print(num+" ");
        System.out.println();
	}
}