import java.util.Scanner;

public class Practice1 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the size of first array elemnt");
	int n=scanner.nextInt();
	System.out.println("Enter the size of of second array elemets");
	int m=scanner.nextInt();
	System.out.println("enter the first array elements");
	int ar1[]=new int[n];
	for(int i=0;i<ar1.length;i++)
	{
		ar1[i]=scanner.nextInt();
	}
	
	
	System.out.println("Enter the second array elements");
	int ar2[]=new int[m];
	for(int i=0;i<ar2.length;i++)
	{
		ar2[i]=scanner.nextInt();
	}
	
merge(ar1,ar2);

}

 static void merge(int ar1[], int ar2[]) {

	int ar3[]=new int[ar1.length+ar2.length];
	for(int i=0;i<ar3.length;i++)
	{
		if(i<ar1.length) {
		ar3[i]=ar1[i];
		}
		if(i<ar2.length)
		{
			ar3[ar1.length+i]=ar2[i];
		}
	}
	for(int i=0;i<ar3.length;i++)
	{
	 System.out.println(ar3[i]);
	}
}

}
