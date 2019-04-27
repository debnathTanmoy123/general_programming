import java.util.Scanner;

public class Practice3 {
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
	
	eliminate(ar);
}

 static void eliminate(int[] ar) {

	 if(ar.length%2==0)
	 {
		 for(int i=0;i<ar.length;i++)
		 {
			 ar[i]=0;
		 }
	 }
	 else
		 for(int i=0;i<ar.length;i++)
		 {
			 ar[i]=1;
		 }
	 for(int i=0;i<ar.length;i++)
	 {
	System.out.println(ar[i]);
	 }
}
}
