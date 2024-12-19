package array;

public class SubArraySumPrefix {

	public static void main(String[] args) {
		int[] arr = { -1, 7, -2, 9, -3, 11 };
		//output is continous part of array
		//like 6,7,8 not like 6,7,10
		
		int[] prefixArr = new int[arr.length];
		prefixArr[0]=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			prefixArr[i]=prefixArr[i-1]+arr[i];
		}
		
		
		int largestSum=0;
		//outer loop for x 
				for (int i = 0; i < arr.length; i++) {
					
					//inner loop for y
					for (int j = i; j < arr.length; j++) {
						//starts from ith index ends jth index 
						
						int subArraySum=0;
						
						//sum of sub array
						subArraySum=i>0?prefixArr[j]-prefixArr[i-1]:prefixArr[j];
			
					
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