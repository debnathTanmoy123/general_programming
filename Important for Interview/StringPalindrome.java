import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence..");
		String st=sc.nextLine();
		boolean b=isPalindrome(st);
		if (b) {
			System.out.println("palindrome");
		} else {
System.out.println("not palindrome");
		}
		sc.close();
		}

	private static boolean isPalindrome(String st) {

		for (int i = 0; i < st.length()/2; i++)
		{
		if(st.charAt(i)!=st.charAt(st.length()-1-i))
			return false;
			
		}
		return true;
	}
}
