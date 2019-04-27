import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int n=scanner.nextInt();
		avg(n);
	}

	 static void avg(int n) {
int avg=0,sum = 0;
int count=0;
		 for(int i=1;i<=n;i++)
		 {
			 if(i%2==0)
			 {
				sum=sum+i; 
			 count++;
			 }
		 }
		 avg=sum/count;
		 System.out.println(avg);
	}
	
}
