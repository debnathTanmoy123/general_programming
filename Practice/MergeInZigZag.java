
public class MergeInZigZag {
	public static void main(String[] args) {
		int ar1[] = { 2, 6, 1, 5, 6, 3 };
		int ar2[] = { 4, 3, 6, 8, 9 };
		int n[] = margeZigzag(ar1, ar2);
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}

	private static int[] margeZigzag(int[] x, int[] y) {

		int z[] = new int[x.length + y.length];

		int i=0;
		int j=0;
		while(i<x.length&&i<y.length)
		{
			z[j++]=x[i];
			z[j++]=y[i++];
		}
		while(i<x.length)
		{
			z[j++]=x[i++];
		}
		
		while(i<y.length)
		{
			z[j++]=y[i++];
		}
			
		return z;
	}
}
