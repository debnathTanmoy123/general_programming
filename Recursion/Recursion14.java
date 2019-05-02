
public class Recursion14 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		String st = "MADAM";
		boolean rs = isPalindrome(st, 0, st.length() - 1);

		if (rs)
			System.out.println("palindrome");

		else
			System.out.println("not palindrome");

		System.out.println("Main method terminated");
	}

	private static boolean isPalindrome(String st, int i, int l) {
		
		if(i>=l)
			return true;
		if(st.charAt(i)!=st.charAt(l))
			return false;

		return isPalindrome(st, i+1, l-1);
	}

}
