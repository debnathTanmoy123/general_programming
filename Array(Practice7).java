import java.util.Scanner;

public class Practice7 {
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
		System.out.println("enter the element value");
		int ele=scanner.nextInt();
		insert(ar,in,ele);
	}

	private static void insert(int[] ar,int in,int ele) {
		
		if(in<0||in>ar.length)
		{
			System.out.println("inseertion is not possible");
		}
		int newArr[]=new int[ar.length+1];
		newArr[in]=ele;
		for(int i=0;i<ar.length;i++)
		{
			if(i<in)
				newArr[i]=ar[i];
			else
				newArr[i+1]=ar[i];
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(newArr[i]);
		}
	}

	
}
