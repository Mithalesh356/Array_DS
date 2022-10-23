//BINARY SEARCH
//	we have to find and return last index occurance of element in given Array
package Array;

import java.util.ArrayList;

public class arr20 {

	
	
	//APPROACH-1
	public static int lasttOcc(int arr[] , int x) {
		int loi = -1;
		for(int i=arr.length-1; i >=0; i--) {
			if(arr[i] != x) {
				continue;
			}else {
				loi = i;
			    return loi;
			}
		}
		return loi;
	}
	
	//APPROACH-2
//	using binary search
	
	public static int lastOccuranceBetter(int arr[] , int x) {
		int si = 0;
		int ei = arr.length - 1;
		int loi = -1;
		while(si <= ei) {
			int mid = (si+ei)/2;
			if(arr[mid] > x) {
				ei = mid-1;
			}else if(arr[mid] < x) {
				si = mid+1;
			}else {
				loi = mid;
				si = mid+1; //is line ke jadu ko samjho
				
			}
		}
		return loi;
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
		
		
		int arr[] = {2,4,6,5,6,6,8};
//		int loi = lasttOcc(arr, 6);
//		System.out.println(loi);
		
		
		int loi = lastOccuranceBetter(arr, 6);
		System.out.println(loi);
		
//		int arr[] = {2,4,0,5,6,6,6,6,8};
//		ArrayList<Integer> list = new ArrayList<>();
//		 for (int i : arr) {
//	            list.add(i);
//		 }
//		 int fi = first(list, 6);
//		 int li = last(list ,6);
//		 System.out.println("foi= " + fi +"\n"+"loi= " +li);

	}

}
