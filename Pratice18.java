import java.util.Scanner;

public class Pratice18 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int n=scanner.nextInt();
		factorial(n);
}

	 static void factorial(int n) {
int r,fact=1;
do {
	r=n%10;
	fact=fact*r;
	n--;
}while(n!=0);
		 
		System.out.println(fact); 
	}
	
}
