//question :- Swap Alternate Element in Array
//i/p=> arr[] = {1,2,3,4,5}
//o/p=> arr[] = {2,1,4,3,5}

package Array;

public class arr02 {
	
//	function for swap element
	public static void swapElement(int arr[] , int i , int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

//	function for swap alternate element
	public static void swapAlternate(int size , int a[]) {
		for(int i=0; i< size-1; i+=2) {
			swapElement(a, i, i+1);
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
   int checkArr[] = {1,2,3,4,5,6,7};
   swapAlternate(7, checkArr);
   printArr(checkArr);
	}

}
