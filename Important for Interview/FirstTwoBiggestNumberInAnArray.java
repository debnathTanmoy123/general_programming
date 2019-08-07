
public class FirstTwoBiggestNumberInAnArray {
	public static void main(String[] args) {
		int ar[]= {2,4,6,1,5,6,3};
		twoBiggest(ar);
		}

	private static void twoBiggest(int[] ar) {

		int firstBig=0;
		int secondBig=firstBig;
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>firstBig)
				firstBig=ar[i];
			if(ar[i]<firstBig&&ar[i]>secondBig)
				secondBig=ar[i];
		}
		System.out.println("firsBig"+firstBig);
		System.out.println("SecondBig"+secondBig);
	}

}
