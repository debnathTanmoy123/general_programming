import java.util.Scanner;

public class UppercasetoLowerCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence..");
		String st = sc.nextLine();
		convert(st);

	}

	private static void convert(String st) {

	
		char ch[]=st.toCharArray();
		for (int i = 0; i < st.length(); i++) {
			if(ch[i]>'A'&&ch[i]<'Z')
				ch[i]=(char) (ch[i]+32);
		}
		String s1=new String(ch);
		System.out.println(s1);
	}
}
