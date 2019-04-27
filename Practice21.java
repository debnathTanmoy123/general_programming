


import java.util.Scanner;

public class Practice21 {


public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("enter the value of n");
	int no=scanner.nextInt();
	
	
upToNarmstrong(no);
	
}

 static void upToNarmstrong(int n) {
int sum=0,count=0;
	
for(int i=1;i<=n;i++)
{
	//boolean rs=armstrong(i);
	if(armstrong(i))
	{
		System.out.println(i+" ");
	}

}
}

private static boolean armstrong(int no) {

	 int arm=0,t=no;

	int dc=countdigit(no);
	do {
		int r=no%10;
		
		arm=arm+power(r, dc);
		no=no/10;
		
	}while(no!=0);
	
	
	return arm==t;
}
static int power(int n,int p) {
	int pw=1;
	
	while(p>0)
	{
pw=pw*n;		 
		 p--;
	}
return pw;
}

 static int countdigit(int n) {
		int count=0;
		do
		{
		count++;
		n=n/10;	
	 }while(n!=0);
	
		return count;
	}
}