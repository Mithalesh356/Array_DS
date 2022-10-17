//question
//merge two sorted Array
//i/p:- arr1[] = {1,3,4,7,11}
//      arr2[] = {2 ,4 ,6,13}
//
//o/p:- mergeArr[] = {1,2,3,4,4,6,11,13}

package Array;

public class arr05 {
	
//	function for merge two Arr
	public static int[] mergeTwoArr(int arr1[] , int arr2[]) {
		int mergeArr[] = new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				mergeArr[k] = arr1[i];
				i++;
				k++;
			}else {
				mergeArr[k] =arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			mergeArr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			mergeArr[k] =arr2[j];
			j++;
			k++;
		}
		return mergeArr;
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
       int arr1[] = {1,3,4,7,11};
       int arr2[] = {2,4,6,13};
       int mergeArr[] = mergeTwoArr(arr1, arr2);
       printArr(mergeArr);
	}

}
