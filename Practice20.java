import java.util.Scanner;

public class Practice20 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int no=scanner.nextInt();
		
		
		boolean rs= armstrong(no);
		if(rs)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
}

	private static boolean armstrong(int no) {

		 int arm=0,t=no;
	
		int dc=countdigit(no);
		do {
			int r=no%10;
			
			arm=arm+power(r, dc);
			no=no/10;
			
		}while(no!=0);
		
		
		return arm==t;
	}
	static int power(int n,int p) {
		int pw=1;
		
		while(p>0)
		{
	pw=pw*n;		 
			 p--;
		}
	return pw;
	}

	 static int countdigit(int n) {
			int count=0;
			do
			{
			count++;
			n=n/10;	
		 }while(n!=0);
		
			return count;
		}
}
