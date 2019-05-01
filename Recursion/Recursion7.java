
public class Recursion7 {
	public static void main(String[] args) {
		int ar[]= {23,45,56,78,12,18};
		int sum=arraySum(ar,0);
		System.out.println(sum);
	}

	 static int arraySum(int ar[],int i) {
	if(i==ar.length)
		return 0;
	
	return ar[i]+arraySum(ar,i+1);
		
	}
}
