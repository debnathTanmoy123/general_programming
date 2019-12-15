import java.util.Scanner;

public class LowerCaseToUpperCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence..");
		String st = sc.nextLine();
		convert(st);

	}

	private static void convert(String st) {

	
		char ch[]=st.toCharArray();
		for (int i = 0; i < st.length(); i++) {
			System.out.println(ch[i]);
			if(ch[i]>'a'&&ch[i]<'z')
				ch[i]=(char) (ch[i]-32);
		}
		String s1=new String(ch);
		System.out.println(s1);
	}
}
