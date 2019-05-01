
public class Recursion4 {

public static void main(String[] args) {
	System.out.println("Main method started");
	int s=fact(5);
	System.out.println(s);
	System.out.println("Main method terminated");
}

 static int fact(int n) {
	if(n==0||n==1)
		return 1;
	return n*fact(n-1);
	
}
}
