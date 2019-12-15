import java.util.Scanner;

public class ConvertNumberIntoWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	 int n=sc.nextInt();//698573284
	convert(n/10000000,"crore");
	convert(n/100000%100,"Lack");
	convert(n/1000%100,"Thousand");
	convert(n/100%10,"Hundred");
	convert(n%100," ");
	sc.close();
}
public static void convert(int n,String st)
{
	String one[]= {" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	String two[]= {" "," ","Tweenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	if (n<20) {
		System.out.println(one[n]);
	} else {
System.out.println(two[n/10]+one[n%10]);
	}
	if(n!=0)
	{
		System.out.println(st+" ");
	}
}
}
