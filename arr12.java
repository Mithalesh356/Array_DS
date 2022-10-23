//BASIC QUESTION OF 1D ARRAY

package Array;

import java.util.Scanner;

public class arr12 {
	
	//@(1)@ function to take input element in array by user
	public static int[] takeInputArray() {
		System.out.println("Enter the size of array");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the element in Array");
	for(int i=0; i<arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	return arr;
	}
	
	
	//@(2)@ function to find largest number in array
	public static int findLargest(int arr[]) {
		System.out.println("largest number in Array");
		int largest=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
	}
	
	
	//@(3)@ function to find smallest number in array
	public static int findSmallest(int arr[]) {
	System.out.println("smallest number in array");
	int smallest= Integer.MAX_VALUE;
	for(int i=0; i< arr.length; i++) {
		if(arr[i]<smallest) {
			smallest=arr[i];
		}
	}
	return smallest;
	}
	
	
	//@(4)@ program to add element in array
	public static int sumArrayEle(int arr[]) {
		System.out.println("required sum");
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	
	//@(5)@ program to swap alternate element in array
    public static void swapAlternate(int arr[]) {
	System.out.println("the required swapped array");
	for(int i=0; i< arr.length-1; i+=2) {
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	     }
	  }


   //@(6)@ find unique element in array 
    public static int findUnique(int arr[]) {
    	int unique=0;
    	for(int i=0; i<arr.length; i++) {
    		unique=unique^arr[i];
    	}
    	return unique;
    }

    
    //@(7)@ program to find duplicate element in sorted array
    public static int findDuplicate(int arr[]) {
    	for(int i=0; i<arr.length-1; i++) {
    		for(int j=i+1; j<arr.length; j++) {
    			if (arr[i]==arr[j]) {
    				return arr[i];
    			}
    		}
    	}
    	return -1;
    }
    
    
    //@(8)@ find intersetion of two array
    public static void intersection(int arr1[], int arr2[] ) {
    	for(int i=0; i<arr1.length; i++) {
    		for(int j=0; j<arr2.length; j++) {
    			if(arr1[i]==arr2[j]) {
    				System.out.print(arr1[i]+" ");
    				arr2[j]=Integer.MIN_VALUE;
    				break;
    			}
    		}
    	}
    }
    
    
    //@(9)@ program to print all possible pairs of array element
    public static void printAllPairs(int arr[]) {
    	for(int i=0; i<arr.length-1; i++) {
    		for(int j=i+1; j<arr.length; j++) {
    			System.out.println("("+arr[i]+","+arr[j]+")");
    		}
    	}
    }
    

 // funtion to print array element
 	public static void printArray(int arr[]) {
 		System.out.println("the required element in array");
 		for(int i=0; i<arr.length; i++) {
 			System.out.print(arr[i]+" ");
 		}
 	}
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {4,7,1,2,5,3,6,8,17};
		printAllPairs(array);
		

	}

}
