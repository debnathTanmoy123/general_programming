
public class Recursion8 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		int s=sumOfDigit(123);
		System.out.println(s);
		System.out.println("Main method terminated");
	}

	 static int sumOfDigit(int n) {
		if(n==0)
			return 0;
	return n%10+sumOfDigit(n/10);
		
	}
}
