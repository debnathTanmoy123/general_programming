import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int m=scanner.nextInt();
		System.out.println("Enter the array Elements");
		int ar[]=new int[m];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the value of n");
		int n=scanner.nextInt();
		nthBiggest(ar,n);
	}

	private static void nthBiggest(int[] ar, int n) {

		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j]>ar[i])
					count++;
			}
			if(count==n-1)
			{
				
					System.out.println(ar[i]);
				
			}
			
		}
		System.out.println("not in range");
	}
}
