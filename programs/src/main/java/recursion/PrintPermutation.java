package recursion;

public class PrintPermutation {

	public static void main(String[] args) {
		String s="ABCD";
		int n=s.length();
		permute(s,0,n-1);
	}
	
	/*
	 * l--first index, r--last index
	 */
	public static void permute(String s, int l,int r) {
		if(l==r) {
			System.out.println(s);//base case
		}
		else {
			for(int i=l;i<=r;i++) {
			s=swap(s,l,i);//root to leaf
			permute(s,l+1,r);
			s=swap(s,l,i);	// backtrack
			}
		}
	}
	public static String swap(String a,int i,int j) {
		char temp;
		char[] charArray=a.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}
	
}


