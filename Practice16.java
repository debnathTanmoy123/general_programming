import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int n=scanner.nextInt();
		evenandOdddigitInAnumber(n);
}

	 static void evenandOdddigitInAnumber(int n) {
		int r;int countEve=0;
		int countOdd=0;
		do {
			
			r=n%10;
			
			
			if(r%2==0)
				countEve++;
			else
				countOdd++;
			n=n/10;
		}while(n!=0);
	System.out.println("odd count="+countOdd);
	System.out.println("eve count="+countEve);
	 }
}
