//BUBBLE SORT(SORTING ALGORITHM)

package Array;

public class arr09 {
	
	
//	programme for swapping elemrnt in array
	public static void swapArr(int arr[] , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for(int i =0; i< n-1; i++) {
			for(int j = 0; j< n -1 -i; j++ ) {
				if(arr[j+1] < arr[j]) {
					swapArr(arr, j+1, j);
				}
			}
		}
	}

	//function for print Arr
		public static void printArr(int arr[]) {
			System.out.println("your required array =>");
			for(int i=0; i< arr.length; i++) {
				System.out.print(arr[i] +" ");
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {4,7,1,9,2,5,3,6,8};
		bubbleSort(array);
		printArr(array);

	}

}
