
public class CountNumberOfPositiveAndNegativeInAnArray {
	public static void main(String[] args) {
		int ar[]= {2,-4,6,1,5,-6,3};
		count(ar);
		}

	private static void count(int[] ar) {

		int countPos=0;
		int countNeg=0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]>0)
			countPos++;
			else
				countNeg++;
		}
		System.out.println("pos=>"+countPos);
		System.out.println("neg"+countNeg);
	}

}
