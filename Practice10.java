import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int n=scanner.nextInt();
		multi(n);
	}

	 static void multi(int n) {
int sum=0;
		 for(int i=0;i<=n;i++)
		 {
			 sum=sum+5*i;
			
		 }
		 System.out.println(sum);
	}
}
