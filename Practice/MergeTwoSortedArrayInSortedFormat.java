
public class MergeTwoSortedArrayInSortedFormat {
	public static void main(String[] args) {
		int a1[]= {2,4,6,8,10};
		int a2[]= {3,5,8,9,11,16,19};
		merge(a1,a2);
		
		}

	private static void merge(int[] a1, int[] a2) {
int c[]=new int[a1.length+a2.length];
		int i=0,j=0,k=0;
		while(i<a1.length&&j<a2.length)
		{
			if(a1[i]<a2[j])
				c[k++]=a1[i++];
			else
				c[k++]=a2[j++];
		}
		while(i<a1.length)
		{
			c[k++]=a1[i++];
		}
		while(i<a2.length)
		{
			c[k++]=a2[j++];
		}
		for (int k2 = 0; k2 < c.length; k2++) {
			System.out.println(c[k2]);
		}
	}
}
