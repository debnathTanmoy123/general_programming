
public class Recursion10 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		boolean s=prime(17,2);
		if(s)
		System.out.println("prime no");
		else
			System.out.println("not prime");
		System.out.println("Main method terminated");
	}

	 static boolean prime(int n,int i) {
		 if(i>n/2)
			 return true;
		 
		if(n%i==0)
			return false;
		 
		 return prime(n,i+1);
	}
}
