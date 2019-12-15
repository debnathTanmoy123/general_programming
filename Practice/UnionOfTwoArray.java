public class UnionOfTwoArray {
	public static void main(String[] args) {
		int ar1[] = { 2, 4, 6, 1, 5, 6, 3 };
		int ar2[] = { 4, 3, 6, 8, 9 };
		union(ar1, ar2);
	}

	private static void union(int[] x, int[] y) {
		int u[] = new int[x.length + y.length];
		for (int i = 0; i < u.length; i++) {
			u[i] = x[i];
		}
		int k = x.length;
		for (int i = 0; i < u.length; i++) {
			boolean find = true;
			for (int j = 0; j < u.length; j++) {
				if (y[i] == x[j]) {
					find = false;
					break;
				}
			}
			if (find)
				u[k++] = y[i];
		}
		int nu[] = new int[k];
		for (int i = 0; i < k; i++) {
			nu[i] = u[i];
		}
	}

}
