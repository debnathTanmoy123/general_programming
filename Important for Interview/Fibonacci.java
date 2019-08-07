
public class Fibonacci {
public static void main(String[] args) {
	int n=3;
	boolean b=isfibonacci(n);
	if (b) {
		System.out.println("fib");
	} else {
System.out.println("not fib");
	}
}

private static boolean isfibonacci(int n) {

	int f1=0,f2=1,f3;
	
	while(f1==n)
	{
		System.out.println(f1);
		f3=f1+f2;
		f1=f2;
		f2=f3;
	}
	
	return false;
}
}
