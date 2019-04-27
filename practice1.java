
public class practice1 {
public static void main(String[] args) {
int n=59;
int a,b;
a=n%10;
b=n/10;
int sum=(a*b)+(a+b);
if(sum==n)
{
	System.out.println("special two digit");
}
else
	System.out.println("not");

}

}
