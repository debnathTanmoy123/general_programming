
public class NthBiggest {
	public static void main(String[] args) {
		int ar[]= {2,4,6,1,5,6,3};
		nthBig(ar,3);
		}

	private static void nthBig(int[] a,int n) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
	 System.out.println(a[a.length-n]);
	}

}
