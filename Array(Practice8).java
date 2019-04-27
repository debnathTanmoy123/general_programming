import java.util.Scanner;

public class Practice8 {
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
		
		System.out.println("enter the index number");
		int in=scanner.nextInt();
		
		delete(ar,in);
}

	private static void delete(int[] ar, int in) {

		if(in<0||in>=ar.length)
		{
			System.out.println("delete is not possible");
		}
		int newArr[]=new int[ar.length-1];
		for(int i=0;i<newArr.length;i++)
		{
			if(i<in)
				newArr[i]=ar[i];
			else
				newArr[i]=ar[i+1];
		}
		for(int i=0;i<newArr.length;i++)
		{
			System.out.println(newArr[i]);
		}
	}
}