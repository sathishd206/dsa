package array;

import java.util.ArrayList;

public class KRotate {

	public static void main(String[] args) {
		int[] arr = { -3,-2,-1,7, 9,11 };
	int n=arr.length;	
	int k=3;
	k=k%n;//modulo as 3 9 15 ..==>common factor in it is 3 
	ArrayList<Integer> output=new ArrayList<Integer>();
	//first add last 3 in arraylist
	for(int i=n-k;i<=n-1;i++) {
		
		output.add(arr[i]);
	}
	//next add remaining in arraylist
	for(int i=0;i<n-k;i++) {
		output.add(arr[i]);
	}

	System.out.println(output);
	}
}

/*
 * o/p [7, 9, 11, -3, -2, -1]
 */
