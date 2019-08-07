
public class DeletDuplicatesAndshowUniqueFromAnArray {
	public static void main(String[] args) {
		int ar[]= {2,4,6,1,5,6,3};
		deleteDup(ar);
		}

	private static void deleteDup(int[] ar) {
		
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]==ar[j])
				{
					ar=deleteArr(ar,j);
					j--;
				}
			}
			
		}
		for (int j = 0; j < ar.length; j++) {
			System.out.println(ar[j]);
		}
	}

	private static int[] deleteArr(int[] ar, int j) {
		int ar1[]=new int[ar.length-1];
		for (int i = 0; i < ar1.length; i++)
		{
		if(i<j)
			ar1[i]=ar[i];
		else
			ar1[i]=ar[i+1];
		}
		
		
		return ar1;
	}
}
