import java.util.Scanner;

public class Practice5 {
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
		
		elememtReverse(ar);
	}

	private static void elememtReverse(int[] ar) {
		int i=0,l=ar.length-1;
		while(i<=l)
		{
			int temp=ar[i];
			ar[i]=ar[l];
			ar[l]=temp;
			i++;
			l--;
		}
		
		for(int j=0;i<ar.length;j++)
		{
			System.out.println(ar[j]);
		}
		
	}
}
