import java.util.Scanner;

public class Practice6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scanner.nextInt();
		System.out.println("Enter the array Elements");
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scanner.nextInt();
		}
		
		biggest(ar);
	}

	private static void biggest(int[] ar) {

		int big=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(big<ar[i])
				big=ar[i];
		}
		System.out.println(big);
	}
}
