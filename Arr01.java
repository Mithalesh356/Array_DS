package Array;

//que:- Array containig 0 and 1 you have to sort 0 and 1

public class Arr01 {
	

	public static void sortZeroOne(int arr[]) {
		int i = 0;
		int j = arr.length-1;
		while(i<j) {
			if(arr[i] == 0) {
				i++;
			}else if(arr[j] == 1){
				j--;
			}else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {1,0, 1,1,0,0,1,0,0,1};
		sortZeroOne(arr);
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
