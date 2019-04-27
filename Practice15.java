import java.util.Scanner;

public class Practice15 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int n=scanner.nextInt();
		productofDigit(n);
}

static void productofDigit(int n) {
int r, prod=1;
do {
	r=n%10;
	prod=prod*r;
	n=n/10;
}while(n!=0);
System.out.println(prod);
	}

}
