import java.util.Scanner;

public class Practice26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the value of n");
		int no = scanner.nextInt();

		boolean rs=fibonacci(no);
if(rs)
	System.out.println("is a fibonacci");
else
	System.out.println("not a fibonacci");
	}

	private static boolean fibonacci(int no) {

		int f1=0,f2=1,f3;
		while(f1<=no)
		{
			if(f1==no)
				return true;
		f3=f1+f2;
		f1=f2;
		f2=f3;
		}
		return false;
	}
}
