package array;

public class SubArraySumNegative {

	public static void main(String[] args) {
		int[] arr = { -1, -7, -2, -9, -3, -11 };

		Boolean allNeg = true;
		// minimum value in java integer
		int largest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			// any element grater than 0
			if (arr[i] > 0) {
				allNeg = false;
			}
			largest = Math.max(largest, arr[i]);
		}

		if (allNeg) {
			System.out.println(largest);
		}
		

		// kadane logic
		int cs = 0;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			// running sum
			cs = cs + arr[i];
			if (cs < 0) {
				cs = 0;
			}
			// max of current sum and ans
			ans = Math.max(cs, ans);
		}
		System.out.println(ans);
	}
}

/*
 * o/p
 * 
 * -1 0
 */