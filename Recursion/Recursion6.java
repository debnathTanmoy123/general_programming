
public class Recursion6 {
	public static void main(String[] args) {
		int ar[]= {23,45,56,78,12,18};
		int sum=arraySum(ar,0,0);
		System.out.println(sum);
	}

	 static int arraySum(int ar[],int i,int sum) {
	if(i==ar.length)
		return sum;
	sum=sum+ar[i];
	return arraySum(ar,i+1,sum);
		
	}
}
