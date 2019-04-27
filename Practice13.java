import java.util.Scanner;

public class Practice13 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int n=scanner.nextInt();
		sumOfcountdigit(n);
}

	 static void sumOfcountdigit(int n) {

		 int sum = 0;
		
		 do{
			sum=sum+n%10;
			n=n/10;
		 }while(n!=0);
		 System.out.println(sum);
	}
}