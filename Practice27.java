import java.util.Scanner;

public class Practice27 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the value of n");
		int n = scanner.nextInt();

		firstNfibonacci(n);

	}

	private static void firstNfibonacci(int n) {
int f1=0,f2=1,f3;
		for(int i=0;i<=n;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.println(f1);
		}
		
	}

}
