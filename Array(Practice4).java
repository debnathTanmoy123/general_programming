import java.util.Scanner;

public class Practice4 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=scanner.nextInt();
	System.out.println("Enter the array element");
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scanner.nextInt();
	}
	
	
	System.out.println("enter  one number");
	int e=scanner.nextInt();
	
	boolean rs=check(arr,e);
	if(rs)
		System.out.println("present");
	else
		System.out.println("not present");
}

private static boolean check(int[] arr, int e) {

	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==e)
return true;

	}
return false;	
}
}
