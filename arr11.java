//INSERTION SORT

package Array;

public class arr11 {
	
	public static void insertionSort(int arr[]) {
		for(int i=1 ; i<arr.length; i++) {
			for(int j= i-1; j>=0 ; j--) {
				if(arr[j] > arr[j+1]) {
					swapElement(arr , j , j+1);
				}else {
					break;
				}
			}
		}
	}
// program for swap element in array
	private static void swapElement(int[] arr, int j, int i) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	//program for print arr element
 public static void printArr(int arr[]) {
		System.out.println("your required array =>");
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	

	public static void main(String[] args) {
		int array[] = {4,7,1,2,5,3,6,8,17};
		insertionSort(array);
		printArr(array);

	}

}
