import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the value of n");
		int n = scanner.nextInt();

	binTodec(n);

	}

	 static void binTodec(int n) {

		 int dec=0,count=0;
		 do {
			int r=n%10;
			 dec=dec+(r*pow(2,count));
			n=n/10;
			count++;
		} while (n!=0);
	System.out.println(dec);	 
	}

 static int pow(int i, int count) {
int pw=1;
while(count>0)
{
	pw=pw*i;
	count--;
}
 return pw;
	}
}
