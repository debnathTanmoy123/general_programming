import java.util.Scanner;

public class Practice1 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number");
	long no=scanner.nextLong();
	numberToSentence(no/10000000,"crore");
	numberToSentence(no/100000%100,"lack");
	numberToSentence(no/1000%100,"thousand");
	numberToSentence(no/100%10,"hundred");
	numberToSentence(no%100,"");
	
}
public static void numberToSentence(long no,String st)
{
	String one[]= {" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
	String two[]= {" "," ","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
	if(no<=20) {
		System.out.print(one[(int) no]);
	}
	else {
		System.out.print(two[(int) (no/10)]+one[(int) (no%10)]);	}
	if(no!=0) {
		System.out.print(st+" ");
	}
}
}
