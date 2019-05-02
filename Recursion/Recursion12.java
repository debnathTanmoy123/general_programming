
public class Recursion12 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		boolean s=isPerfect(6,1,0);
		if(s)
		System.out.println("perfect no");
		else
			System.out.println("not perfect");
		System.out.println("Main method terminated");
	}

	 static boolean isPerfect(int n,int i,int sum) {
		 if(i>n/2)
			 return sum==n;
		 
		if(n%i==0)
			sum=sum+i;
		 
		 return isPerfect(n, i+1, sum);
	}}
