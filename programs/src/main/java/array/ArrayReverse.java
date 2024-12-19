package array;


public class ArrayReverse {
public static void main(String[] args) {
	int[] arr= {6,7,8,9,10,11};
	
	int s = 0;
	int e=arr.length-1;
	
	//loop till start and end converges and end becomes less than start
	while(s<=e) {
	//swap
	int temp=arr[s];
	arr[s]=arr[e];
	arr[e]=temp;
	
	//end moving towards left by -1
	e-=1;
	//start moving right by +1
	s+=1;}
	
	for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+", ");	}	
	
}
}

/*
 * o/p
 * 
 * 11, 10, 9, 8, 7, 6,
 */