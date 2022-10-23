//SELECTION SORT(SORTING ALGORITHM)


package Array;

public class arr10 {
	
//	programme for swapping element in array
	public static void swapArr(int arr[] , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	//SELECTION SORT
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		for(int i=0 ; i< n-1; i++) {
			int min_idx = i;
			for(int j=i+1; j< n; j++) {
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			swapArr(arr, i, min_idx);
			
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
		int array[] = {4,7,1,2,5,3,6,8};
		selectionSort(array);
		printArr(array);
	}


}
