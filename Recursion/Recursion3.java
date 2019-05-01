
public class Recursion3 {

public static void main(String[] args) {
System.out.println("Main method started");
int s=sum(5);
System.out.println(s);
System.out.println("Main method terminated");
}

 static int sum(int n) {
	if(n==0)
		return 0;
	return n+sum(n-1);
}
}
