import java.util.Scanner;

public class Practice28 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the value of n");
		int n = scanner.nextInt();

	withinNfibonacci(n);

	}

	private static void withinNfibonacci(int n) {
int f1=0,f2=1,f3;
		while(f1<=n)
		{
			System.out.println(f1);
			f3=f1+f2;
			f1=f2;
			f2=f3;
			
		}
		
	}
}
