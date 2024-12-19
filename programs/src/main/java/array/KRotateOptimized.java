package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KRotateOptimized {

	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(-3,-2,-1,7, 9,11 );
	int n=arr.size();	
	int k=3;
	k=k%n;//modulo as 3 9 15 ..==>common factor in it is 3 
	Collections.reverse(arr.subList(0,k));
	Collections.reverse(arr.subList(k,n));
	Collections.reverse(arr);
	System.out.println(arr);
	}
}

/*
 * o/p [7, 9, 11, -3, -2, -1]
 */
