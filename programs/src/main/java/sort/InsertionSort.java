package sort;


//analogy card sorting
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { -1, -7, -2, -9, -3, -11 };

		/*
		 * for (int i = 1; i <= arr.length - 1; i++) { //current element int
		 * curr=arr[i]; //previous index int prev=i-1; //prev index greater than -1 and
		 * previous element greater than current element while(prev>=0 &&
		 * arr[prev]>curr) { //make current element as previous element
		 * arr[prev+1]=arr[prev]; //reduce previous index and continue loop prev=prev-1;
		 * } //prev+1=curr, so it keeps element in same index without no movement
		 * arr[prev+1]=curr; }
		 * 
		 * for (int a : arr) { System.out.print(a + ", "); }
		 */
		
		//loop moves from right to left like 1->0, 2->0, 3->0, 4->0, 5->0	
		for (int i = 1; i <= arr.length - 1; i++) {
			//current element
			int curr=arr[i];
			//previous index
			int prev=i-1;
			//prev index greater than -1 and previous element greater than current element
			while(prev>=0 && arr[prev]>curr) {
				//make current element as previous element
				//insertion happens by moving largest element as current element
				arr[i]=arr[prev];
				//reduce previous index and continue loop
				prev=prev-1;
			}
			//prev+1=curr, so it keeps element in same index without no movement
			arr[i]=curr;
			
			}
			for (int a : arr) {
				System.out.print(a + ", ");
			}
			
}}

/*
 * o/p
 * 
 * -1, -7, -2, -9, -3, -11,
 */
