import java.util.Scanner;

public class Practice4 {

public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("enter the value of n");
	int n=scanner.nextInt();
	sum(n);
}
static void sum(int n)
{
	int sum=0;
	for(int i=0;i<=n;i++)
	{
		sum=sum+i;
	}
	System.out.println(sum);
}
}
