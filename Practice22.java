import java.util.Scanner;

public class Practice22 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int no=scanner.nextInt();
		
		
		boolean rs= prime(no);
		if(rs)
			System.out.println("prime");
		else
			System.out.println(" not prime");
}

	 static boolean prime(int n) {

		 int i=2;
		 while(i<n)
		 {
			 if(n%i==0)
				 return false;
			 i++;
		 }
		 
		 return true;
	}
}
