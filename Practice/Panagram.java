
public class Panagram {
	public static void main(String[] args) {
		String st = "ABCDEFGHIJKLMNOPQRSTuvWXY";
		boolean b = isPanagram(st);
		if (b) {
			System.out.println("is panagram");
		} else {
			System.out.println("not panagram");
		}

	}

	private static boolean isPanagram(String st) {
		int c[] = new int[26];
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				c[ch - 65]++;
			else
				c[ch - 97]++;
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 0)
				return false;
		}
		return true;
	}
}
