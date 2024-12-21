package sort;


public class CountingSort {

	public static void main(String[] args) {
		//works only for positive numbers
		int[] arr = { 1, 7, 2, 9, 3, 11 };
		int largest=-1;
		//get max of array
		for (int i=0;i<arr.length;i++) {
			largest=Math.max(largest, arr[i]);
		}
		
		//create frequency array, here largest+1 because we need for 0 index
		int[] freq =new int[largest+1];
		for(int num:arr) {
			//same numbers repeated then number will be incremented
			freq[num]++;
		}
		
		//transferring number sort to original array
		int j=0;
		for (int i=0;i<largest;i++) {
			while(freq[i]>0) {
				//starts from zero to last of arr index
				arr[j]=i;
				//reduces freq array index
				freq[i]--;
				//increase index
				j++;
			}
		}
		for (int a : arr) {
			System.out.print(a + ", ");
		}
	}
}

/*
 * o/p
 * 
 * 1, 2, 3, 7, 9, 11,
 */
