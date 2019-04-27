import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the value of n");
		int n = scanner.nextInt();

		binTooctal(n);

	}

	
	private static void binTooctal(int n) {
int r;
		String oct="";
do
{
    r=n%8;
    oct=r+oct;
    n=n/8;
}while(n!=0);
System.out.println(oct);
	}
}
