
public class CountEvenOddInAnArray {
	public static void main(String[] args) {
		int ar[]= {2,4,6,1,5,6,3};
		evenOdd(ar);
		}

	private static void evenOdd(int[] ar) {
int countEven=0;
int countOdd=0;
for (int i = 0; i < ar.length; i++) {
	if(ar[i]%2==0)
		countEven++;
	else
		countOdd++;
}
		System.out.println("even=>"+countEven);
		System.out.println("odd=>"+countOdd);
	}
}
