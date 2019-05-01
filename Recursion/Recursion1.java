

public class Recursion1 {
public static void main(String[] args) {
System.out.println("Main method started");
print(5);
System.out.println("Main method terminated");
}

 static void print(int n) {
	if(n>1)
	 print(n-1);
	System.out.println(n);
	
}
}
