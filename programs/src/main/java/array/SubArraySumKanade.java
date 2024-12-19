package array;

public class SubArraySumKanade {

	public static void main(String[] args) {
		int[] arr = { -1, 7, -2, 9, -3, 11 };
		// output is continous part of array
		// like 6,7,8 not like 6,7,10

		// current sum
		int cs = 0;

		int largestSum = 0;

		for (int i = 0; i < arr.length; i++) {
			// running sum of array
			cs = cs + arr[i];
			if (cs < 0) {
				cs = 0;
			}
			// running max number of array
			largestSum = Math.max(cs, largestSum);
		}
		System.out.println(largestSum);
	}

}
