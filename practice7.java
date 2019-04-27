import java.util.Scanner;

public class practice7 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int n=scanner.nextInt();
		divisible(n);
	}

 static void divisible(int n) {

	 int count=0;
	 for(int i=1;i<=n;i++)
	 {
		 if(i%3==0&&i%5==0)
		 {
			//System.out.println(i);
			count++;
		 }
		 
	 }
	 System.out.println(count);
	}

}
