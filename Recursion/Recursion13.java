
public class Recursion13 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		int s = gcd(12, 8);

		System.out.println(s);

		System.out.println("Main method terminated");
	}

	static int gcd(int m, int n) {
		if (n>m)
			gcd(n,m);

		if(m%n==0)
			return n;
		
		return gcd(n,m%n);
	}
}
