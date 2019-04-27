import java.util.Scanner;

public class Practice19 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int no=scanner.nextInt();
		
		
		boolean rs= strong(no);
		if(rs)
			System.out.println("strong");
		else
			System.out.println("not strong");
}

	
 static boolean strong(int no) {
	 
	 int r;
	 int st=0;
	 do {
		 r=no%10;
		 st=st+factorial(r);
		 
	 }while(no!=0);
return no==st;
 }

	static int factorial(int n) {
int r,fact=1;
do {
	r=n%10;
	fact=fact*r;
	n--;
}while(n!=0);
		 
		return fact; 
	}
	
	
}
