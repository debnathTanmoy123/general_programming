import java.util.Scanner;

public class Practice6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int n=scanner.nextInt();
		System.out.println("enter the value of p");
		int p=scanner.nextInt();
		
		power(n,p);
	}

	 static void power(int n,int p) {
	int pw=1;
	
	while(p>0)
	{
pw=pw*n;		 
		 p--;
	}
System.out.println(pw);
}
}