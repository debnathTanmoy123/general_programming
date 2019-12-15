
public class Anagram {
	public static void main(String[] args) {
		String s1 = "peekga";
		String s2 = "keep";
		boolean b = isAnagram(s1, s2);
		if (b) {
			System.out.println("It is anagram");
		} else {
			System.out.println("It is not anagram");
		}
	}

	private static boolean isAnagram(String s1, String s2) {

		int c1[] = new int[26];
		int c2[] = new int[26];
		for (int i = 0; i < s1.length(); i++) {

			char ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z')
				c1[ch-65]++;
			else
				c1[ch-97]++;
		}
		for (int i = 0; i < s2.length(); i++) {

			char ch=s2.charAt(i);
			if(ch>='A'&&ch<='Z')
				c2[ch-65]++;
			else
				c2[ch-97]++;
		}

		for (int i = 0; i < c2.length; i++) {
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
}
