//POPULATE ELEMENT IN ARRAY(OF GIVEN N)
//task :- populate array using the integer value
//int the range 1 to N both (Inclusive) in order
// 
//in n =7
//the output arr = {1,3,5,7,6,4,2}

package Array;

public class arr17 {
	
	//programme to populate element in array
	public static int[] populateElementArrange(int n) {
		int arr[] = new int[n];
		int si = 0;
		int ei = n-1;
		int counter = 1;
		while(si <= ei) {
			if(counter % 2 != 0) {
				arr[si++] = counter++;	
			}else {
				arr[ei--] = counter++;
			}
		}
		return arr;
	}

	//program for print arr element
	 public static void printArr(int arr[]) {
			System.out.println("your required array =>");
			for(int i=0; i< arr.length; i++) {
				System.out.print(arr[i] +" ");
			}
	 }
	 
	 
	public static void main(String[] args) {
		int arr[] = populateElementArrange(10);
		printArr(arr);

	}

}
