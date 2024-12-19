package array;

public class SubArraySumBruteForce {
	public static void main(String[] args) {
		int[] arr = { -1, 7, -2, 9, -3, 11 };
		//output is continous part of array
		//like 6,7,8 not like 6,7,10
		int largestSum=0;
		//outer loop for x 
				for (int i = 0; i < arr.length; i++) {
					
					//inner loop for y
					for (int j = i; j < arr.length; j++) {
						//starts from ith index ends jth index 
						
						int subArraySum=0;
						
						for(int k=i;k<=j;k++) {
							//takes out some element from array based on kth index
							//sum sub array
							subArraySum+=arr[k];
						}
						//assign max to largestSum
						largestSum=Math.max(largestSum, subArraySum);
					}

				}
				System.out.println(largestSum);
			}
	}

	/*
	 * o/p
	 * 
	 * 22
	 */