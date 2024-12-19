package array;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int key=5;
		//try to visualize moving start and end point based on condition
		System.out.println( binarSearch(arr, key));
	}

	//for binary search to work array should be sorted first
	private static int binarSearch(int[] arr, int key) {
		int s=0;
		int e=arr.length-1;
		//loop till start and end converges and end becomes less than start
		while(s<=e) {
			//mid point of array
			int mid=(s+e)/2;
			
			//mid point index element equals key return mid
			if(arr[mid]==key) {
				return mid;
			}
			//move end before mid point if key is less than mid point element
			else if(arr[mid]>key) {
				e=mid-1;
			}
			//move start after mid point element if key is greater
			else {s=mid+1;}
		}
		return -1;
	}
}

/*
 * o/p
 *  4
 */