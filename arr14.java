//QUESTION
//push 0 at the end without disording the whole array
package Array;

public class arr14 {

	
	//function for pushing 0 at the end of the array(in this solution order of arr elenment would be disorder)
	public static void pushZeroAtEnd(int arr[]) {
		int i=0;
    	int j=arr.length-1;
    	while(i<j) {
    		if(arr[i]!=0) {
    			i++;
    		}else if(arr[j]==0) {
    			j--;
    		}else {
    			int temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    		}
    	}
	}
	
	
	//better Solutin (Best Approaches)
	public static void pushZeroAtEndBetter(int arr[]) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while(count < arr.length) {
			arr[count++] = 0;
			
		}
	}
	
	//program for print arr element
	 public static void printArr(int arr[]) {
			System.out.println("your required array =>");
			for(int i=0; i< arr.length; i++) {
				System.out.print(arr[i] +" ");
			}
	 }
	 
	 
	public static void main(String[] args) {
	int arr[] = {0,4,0,1,0,9,11 , 0 , 66};
	pushZeroAtEndBetter(arr);
	printArr(arr);

	}

}
