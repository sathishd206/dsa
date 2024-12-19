package array;

//for lower bound to work we need to have sorted array
public class LowerBound {

	public static void main(String[] args) {
		//sorted array
		int[] arr = { -3,-2,-1,7, 9,11 };
		
		int s=0;
		int e=arr.length-1;
		int key=8;
		int ans=-1;
		
		//kind of binary search
		while(s<=e) {
			int mid=(s+e)/2;
			//if search key is near assign ans as it
			if(arr[mid]<=key) {
				ans=arr[mid];
				s=mid+1;
			}
			else {
				e=mid-1;
			}
			
		}
				System.out.println(ans);
			}
	
	
}

/*
 * o/p
 * 
 * 7
 */