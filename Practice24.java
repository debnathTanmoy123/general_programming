import java.util.Scanner;

public class Practice24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the value of m");
		int m = scanner.nextInt();

		System.out.println("enter the value of n");
		int n = scanner.nextInt();

		
		upToprime(m,n);

	}

	private static void upToprime(int m, int n) {
		
		for(int i=m;i<=n;i++)
		{
			boolean rs=prime(i);
			if(rs)
			{
				System.out.println(i);
			}
		}
		
	}
	
	static boolean prime(int n) {

		int i = 2;
		while (i < n) {
			if (n % i == 0)
				return false;
			i++;
		}

		return true;
	}
}
