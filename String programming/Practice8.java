import java.util.Scanner;

public class Practice8 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the String");
	String original,reverse="";
	original=scanner.nextLine();
	int length=original.length();
	for(int i=length-1;i>=0;i--)
	{
		reverse=reverse+original.charAt(i);
	}
	System.out.println(reverse);
}
}
