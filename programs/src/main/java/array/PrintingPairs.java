package array;

public class PrintingPairs {
	public static void main(String[] args) {
		int[] arr = { 6, 7, 8, 9, 10, 11 };
		//first work out like this 
		//6,7|6,8|6,9|6,10|6,11|
		//7,8|7,9|7,10|7,11|
		//8,9|8,10|8,11|
		//9,10|9,11|
		//10,11|
		
		//outer loop for x 
		for (int i = 0; i < arr.length; i++) {
			
			//inner loop for y
			for (int j = i + 1; j < arr.length; j++) {
				//takes out some element from array based on ith and jth index
				System.out.println("x,y " + arr[i] + ", " + arr[j]);
			}
			
			//simply to give space between pairs
			System.out.println();

		}
	}
}

/*
 * o/p x,y 6, 7 x,y 6, 8 x,y 6, 9 x,y 6, 10 x,y 6, 11
 * 
 * x,y 7, 8 x,y 7, 9 x,y 7, 10 x,y 7, 11
 * 
 * x,y 8, 9 x,y 8, 10 x,y 8, 11
 * 
 * x,y 9, 10 x,y 9, 11
 * 
 * x,y 10, 11
 */
