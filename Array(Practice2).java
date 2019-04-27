import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array element");
		int ar[]=new int[5];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scanner.nextInt();
		}
		
		countPrime(ar);
	}
	
	
static void countPrime(int[] ar) {

	int count=0;
	for(int i=0;i<ar.length;i++)
	{
		if(isprime(ar[i])) {
			count++;
		}
	}
	System.out.println(count);
	}


static boolean isprime(int n)
{
	int i=2;
	while(i<n/2)
	{
		if(n%i==0)
		{
			return false;
		}
		i++;
		
	}
	return true;
}
}
