import java.util.Scanner;

public class Practice14 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int n=scanner.nextInt();
		reverse(n);
}

static void reverse(int n) {
int r,rv=0;
do {
r=n%10;
rv=rv*10+r;
n=n/10;
}while(n!=0);
System.out.println(rv);
	}
	
}
