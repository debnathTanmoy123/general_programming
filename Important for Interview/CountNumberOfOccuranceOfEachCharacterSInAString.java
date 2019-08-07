import java.util.Scanner;

public class CountNumberOfOccuranceOfEachCharacterSInAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence..");
		String st = sc.nextLine();
		count(st);

	}

	private static void count(String st) 
	{
		int c[]=new int[128];
		for (int i = 0; i < st.length(); i++) {
			char ch=st.charAt(i);
			c[ch]++;
		}
		for (int i = 0; i < c.length; i++) {
			if(c[i]>0)
				System.out.println((char)i+"=>"+c[i]);
		}
	}
}
