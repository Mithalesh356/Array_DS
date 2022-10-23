//FIND SECOND LARGEST ELEMENT IN ARRAY
package Array;

public class arr18 {

	public static int secondLargestElement(int arr[]) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,7,6,5,9,8,4};
		int SL = secondLargestElement(arr);
		System.out.println(SL);

	}

}
