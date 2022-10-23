//TRIPLET & TRIPLET SUM COUNT

package Array;

public class arr13 {

	
	  // program to print all possible triplet of array element
    public static void printAllTriplet(int arr[]) {
    	int n=arr.length;
    	for(int i=0; i<n-2; i++) {
    		for(int j=i+1; j<n-1; j++) {
    			for(int k=j+1; k<n; k++) {
    				System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
    			}
    		}
    	}
    }
    
    
    // find no of count of triplet sum is equal to x
    public static int tripletSum(int arr[], int x) {
    	int n=arr.length;
    	int count=0;
    	for(int i=0; i<n-2; i++) {
    		for(int j=i+1; j<n-1; j++) {
    			for(int k=j+1; k<n; k++) {
    				if(arr[i]+arr[j]+arr[k]==x) {
    					count++;
    				}
    			}
    		}
    	}
    	return count;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
