import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int n=scanner.nextInt();
		multiple(n);
	}

	 static void multiple(int n) {
		int count=0;
		 for(int i=1;i<=n;i++)
		 {
			 if(i%7==0)
			 {
				 System.out.println(i);
			 count++;
			 }
		 }
		 
		 System.out.println("there are "+count);
	}

 

}
