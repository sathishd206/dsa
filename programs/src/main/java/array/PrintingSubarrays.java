package array;

public class PrintingSubarrays {
public static void main(String[] args) {
	int[] arr = { 6, 7, 8, 9, 10, 11 };
	//output is continous part of array
	//like 6,7,8 not like 6,7,10
	
	//outer loop for x 
			for (int i = 0; i < arr.length; i++) {
				
				//inner loop for y
				for (int j = i; j < arr.length; j++) {
					//starts from ith index ends jth index 
					
					
					for(int k=i;k<=j;k++) {
						//takes out some element from array based on kth index
					System.out.print(arr[k]+",");
					}
					//simply to give space between pairs
					System.out.println();
				}
				
				//simply to give space between pairs
				System.out.println();

			}
		}
}

/*
 * o/p 6, 6,7, 6,7,8, 6,7,8,9, 6,7,8,9,10, 6,7,8,9,10,11,
 * 
 * 7, 7,8, 7,8,9, 7,8,9,10, 7,8,9,10,11,
 * 
 * 8, 8,9, 8,9,10, 8,9,10,11,
 * 
 * 9, 9,10, 9,10,11,
 * 
 * 10, 10,11,
 * 
 * 11,
 */

