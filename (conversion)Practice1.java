import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the value of n");
		int no = scanner.nextInt();

		setedBits(no);

	}

	static void setedBits(int no) {
		int count = 0;
		do {
			if (no % 2 == 1) {
				count++;
			no=no/10;
			}
		} while (no != 0);
		System.out.println(count+" ");
	}
}
