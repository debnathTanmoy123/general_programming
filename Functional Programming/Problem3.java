import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=scanner.nextInt();
		int count=countdigit(year);
		if(count==4){
		boolean b=isLeapYear(year);
		if(b)
			System.out.println("leap year");
		else
			System.out.println("not a leap year");
		}
		else
			System.out.println("Enter a 4 digit year ");
	}
private static boolean isLeapYear(int year) {
		 
		
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
		   {
		       return true;
		     
		   }
		
		

		return false;
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
