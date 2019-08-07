
public class MergeInZigZag {
	public static void main(String[] args) {
		int ar1[] = { 2, 4, 6, 1, 5, 6, 3 };
		int ar2[] = { 4, 3, 6, 8, 9 };
		merge(ar1, ar2);
	}

	private static void merge(int[] a, int[] b) {

		int na[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			na[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			na[a.length+i]=b[i];
		}
		for (int i = 0; i < na.length; i++) {
			System.out.println(na[i]);
		}
	}
}
