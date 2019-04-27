import java.util.Scanner;

public class Practice12 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int n=scanner.nextInt();
		countdigit(n);
	}

	 static void countdigit(int n) {
		int count=0;
		do
		{
		count++;
		n=n/10;	
	 }while(n!=0);
	
		System.out.println(count);
	}
}
