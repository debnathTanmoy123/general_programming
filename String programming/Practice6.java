import java.util.Scanner;

public class Practice6 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the sentence");
	String str=scanner.nextLine();
	
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='A'&&ch[i]<='Z')
		ch[i]=(char)(ch[i]+32);
	}
	//String s=new String(ch);
	//System.out.println(s);
	System.out.println(ch);
}
}
