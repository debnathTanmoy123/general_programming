
public class InsertElementInASpecificIndexOfAnArray {
	public static void main(String[] args) {
		int ar[]= {2,4,6,1,5,6,3};
		reverse(ar,3,5);
		}

	private static void reverse(int[] ar, int in,int ele) {

		int ar1[]=new int[ar.length+1];
		ar1[in]=ele;
		for (int i = 0; i < ar.length; i++) {
			if(i<in)
				ar1[i]=ar[i];
			else
				ar1[i+1]=ar[i];
		}
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}
	}

}
