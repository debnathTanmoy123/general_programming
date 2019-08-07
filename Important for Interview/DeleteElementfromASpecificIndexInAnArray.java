
public class DeleteElementfromASpecificIndexInAnArray {
	public static void main(String[] args) {
		int ar[]= {2,4,6,1,5,6,3};
		delete(ar,3);
		}

	private static void delete(int[] ar, int in) {

		int ar1[]=new int[ar.length-1];
		for (int i = 0; i < ar1.length; i++)
		{
		if(i<in)
			ar1[i]=ar[i];
		else
			ar1[i]=ar[i+1];
		}
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}
	}

}
