
public class Recursion11 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		int s = pow(5, 3);

		System.out.println(s);

		System.out.println("Main method terminated");
	}

	static int pow(int n, int p) {
		if (p == 0)
			return 1;

		return n*pow(n, p - 1);
	}
}
