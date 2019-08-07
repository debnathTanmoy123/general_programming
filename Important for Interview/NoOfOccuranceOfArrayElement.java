
public class NoOfOccuranceOfArrayElement {
	public static void main(String[] args) {
		int ar[]= {2,4,6,1,5,6,3};
		occurance(ar);
		}

	private static void occurance(int[] ar) {

		int n=ar.length;
		
		for (int i = 0; i < n; i++) {
			int count=1;
			for (int j = i+1; j < n; j++) {
				if(ar[i]==ar[j])
					
				{
					count++;
					ar[j]=ar[n-1];
					n--;
					j--;
				}
			}
			System.out.println(ar[i]+"=>"+count);
		}
	}
}
