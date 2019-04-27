import java.util.Scanner;

public class Practice2 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the value of a");
	int a=scanner.nextInt();
	System.out.println("enter the value of b");
	int b=scanner.nextInt();
	System.out.println("enter the value of c");
	int c=scanner.nextInt();
	check(a, b, c);
}
static void check(int a,int b,int c)
{
	if(a>b&&a>c)
	{
		System.out.println("a is greatest");
	}
	else if(b>c)
	{
		System.out.println("b is greatest");
	}
	
	else
		System.out.println("c is greatest");
	

}
}
