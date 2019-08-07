
public class ReverseArrayElement {
	public static void main(String[] args) {
		int ar[]= {2,4,6,1,5,6,3};
		reverse(ar);
		}

	private static void reverse(int[] ar) 
	{

	for (int i = 0; i < ar.length/2; i++) {
		int t=ar[i];
		ar[i]=ar[ar.length-1-i];
		ar[ar.length-1-i]=t;
	}
	for (int i = 0; i < ar.length; i++) {
		System.out.println(ar[i]);
	}
	}
}
