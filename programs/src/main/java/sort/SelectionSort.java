package sort;

//analogy select minimum in array and place one by one left to right
public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = { -1, -7, -2, -9, -3, -11 };
		
		//last n-1 will maximum by operation
		for(int i=0;i<=arr.length-2;i++) {		
			
			int min_index=i;
			
			//why j=i, leaving sorted things back, finding minimum element in array
			//inner loop can have long length than outer loop
			for(int j=i;j<=arr.length-1;j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
			}
			
			//swap current element with minimum element
			int temp;
			temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
	
		for (int a : arr) {
			System.out.print(a + ", ");
		}
	}
}

/*
 * o/p
 * 
 * -11, -9, -7, -3, -2, -1,
 */