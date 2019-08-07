
public class SmallestElementInAnArray {
	public static void main(String[] args) {
		int ar[]= {2,4,6,1,5,6,3};
		small(ar);
		}

	private static void small(int[] ar) {

		int small=ar[0];
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]<small)
				small=ar[i];
		}
		System.out.println(small);
		
	}
}
