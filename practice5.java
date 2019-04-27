import java.util.Scanner;

public class practice5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int n=scanner.nextInt();
		table(n);
	}

	 static void table(int n) {

		 for(int i=0;i<=10;i++)
		 {
			 System.out.println(n+"x"+i+"="+n*i);
		 }
	}
}
