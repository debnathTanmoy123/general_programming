import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the value of n");
		int n = scanner.nextInt();

		decTohexa(n);

	}

	 static void decTohexa(int n) {
String hx="";
do{	
int r=n%16;
if(r<10)
	hx=r+hx;
if(r==10)
	hx='A'+hx;

if(r==11)
	hx='b'+hx;

if(r==12)
	hx='c'+hx;

if(r==13)
	hx='D'+hx;

if(r==14)
	hx='E'+hx;
if(r==15)
	hx='f'+hx;


n=n/16;
}while(n!=0);

	 System.out.println(hx);
	 }

}
