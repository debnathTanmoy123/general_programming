import java.util.Scanner;

public class Practice25 {

	
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("enter the value of n");
			int no = scanner.nextInt();

			upToprime(no);

		}

		static void upToprime(int no) {
	int count=0;
			for (int i = 2; i <= no; i++) {
				
				boolean rs=prime(i);
				if (rs) {
					System.out.println(i);
					count++;
				}
			}
			System.out.println("count=>>"+count);

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
