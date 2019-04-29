import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.nextLine();
		int sum = 0;
		char ch[] = str.toCharArray();
		for (int i = 0; i <str.length(); i++) {

			if (ch[i]>= '0' && ch[i] <= '9') {
				sum=sum+ch[i]-48;

			}
		}
		System.out.println(sum);
	}
}