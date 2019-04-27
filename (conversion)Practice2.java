import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the value of n");
		int n = scanner.nextInt();

		decToBin(n);

	}

	private static void decToBin(int n) {
int r;
		String bin="";
while(n>0)
{
    r=n%2;
    bin=r+bin;
    n=n/2;
}
System.out.println(bin);
	}
}
