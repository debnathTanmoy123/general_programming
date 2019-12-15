
public class BiggestElement {
	public static void main(String[] args) {
		int ar[] = { 2, 4, 6, 1, 5 };
		biggest(ar);
	}

	private static void biggest(int[] ar) {

		int big = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > big) {
				big = ar[i];
			}

		}
		System.out.println(big);
	}
}
