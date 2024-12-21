package sort;

//analogy bubble raise while boiling water
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { -1, -7, -2, -9, -3, -11 };

		//why from index 1 not 0, because index zero will by automatically have minimum number
		for (int times = 1; times <= arr.length - 1; times++) {

			//swap happens inside loop, includes 0 index and continues till last-1, why minus because arr[i+1]
			for (int i = 0; i <= arr.length - times - 1; i++) {
				//swap happens only if current element is greater than next element
				
				if (arr[i] > arr[i + 1]) {
					int temp = 0;
					temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int a : arr) {
			System.out.print(a + ", ");
		}
	}
}

/*
 * o/p -11, -9, -7, -3, -2, -1,
 */