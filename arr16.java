//Given a sequence arr[] of size n, Write a function int equilibrium(int[] arr, int n)
//that returns an equilibrium index (if any) or -1 if no equilibrium index exists. 
//
//The equilibrium index of an array is an index such that the sum of elements at
//lower indexes is equal to the sum of elements at higher indexes. 

//Input: A[] = {-7, 1, 5, 2, -4, 3, 0} 
//Output: 3 
//3 is an equilibrium index, because: 
//A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
		
package Array;

public class arr16 {
	
	public static int equilibriumIndex(int arr[]) {
		for(int i=0; i< arr.length; i++) {
			
			//left sum
			int leftSum = 0;
			for(int j=0; j<i; j++) {
				leftSum+=arr[j];
			}
			//right sum
			int rightSum = 0;
			for(int j=i+1; j< arr.length; j++) {
				rightSum+=arr[j];
			}
			if(leftSum == rightSum) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {-7, 1, 5, 2, -4, 3, 0} ;
		int eqi = equilibriumIndex(A);
		System.out.println(eqi);

	}

}
