//BINARY SEARCH
//	we have to find and return first index occurance of element in given Sorted Array
package Array;

import java.util.ArrayList;

public class arr19 {

	
	
	//APPROACH-1
	public static int firstOcc(int arr[] , int x) {
		int foi = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != x) {
				continue;
			}else {
				foi = i;
			    return foi;
			}
		}
		return foi;
	}
	
	//APPROACH-2
//	using binary search
	
	public static int firstOccuranceBetter(int arr[] , int x) {
		int si = 0;
		int ei = arr.length - 1;
		int foi = -1;
		while(si <= ei) {
			int mid = (si+ei)/2;
			if(arr[mid] > x) {
				ei = mid-1;
			}else if(arr[mid] < x) {
				si = mid+1;
			}else {
				foi = mid;
				ei = mid-1; //is line ke jadu ko samjho
				
			}
		}
		return foi;
	}
	
	//APPROACH-3
	//using inbuilt arraylist function
	  public static int first(ArrayList<Integer> list, int x){
	        return list.indexOf(x);
	    }
	    public static int last(ArrayList<Integer> list, int x){
	        return list.lastIndexOf(x);
	    }
	
	public static void main(String[] args) {
		
		
//		int arr[] = {2,4,0 ,5,6,6,8};
//		int foi = firstOccuranceBetter(arr, 6);
//		System.out.println(foi);
		
		int arr[] = {2,4,0,5,6,6,6,6,8};
		ArrayList<Integer> list = new ArrayList<>();
		 for (int i : arr) {
	            list.add(i);
		 }
		 int fi = first(list, 6);
		 int li = last(list ,6);
		 System.out.println("foi= " + fi +"\n"+"loi= " +li);

	}

}
