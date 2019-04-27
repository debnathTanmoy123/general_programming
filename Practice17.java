import java.util.Scanner;

public class Practice17 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int n=scanner.nextInt();
	boolean rs= palindrome(n);
	if(rs)
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
}

	 static boolean palindrome(int no) {
		 
	return reverse(no)==no;
		 
	}
	 static int reverse(int n) {
		 int r,rv=0;
		 do {
		 r=n%10;
		 rv=rv*10+r;
		 n=n/10;
		 }while(n!=0);
		return rv;
		 	}
}
