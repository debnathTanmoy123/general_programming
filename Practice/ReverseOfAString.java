import java.util.Scanner;

public class ReverseOfAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence..");
		String st = sc.nextLine();
		reverse(st);

	}

	private static void reverse(String st) {
		String newStr = "";
		for (int i = st.length()-1; i>=0; i--) {
			char ch=st.charAt(i);
			newStr=newStr+ch;
		}

		System.out.println(newStr);
	}
}
