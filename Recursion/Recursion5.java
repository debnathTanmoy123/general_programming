
public class Recursion5 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		int s=fibo(5);
		System.out.println(s);
		System.out.println("Main method terminated");
	}

	 static int fibo(int n) {
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		return fibo(n-1)+fibo(n-2);
		
	}
}
