import java.util.Scanner;

public class Practice4 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the string");
    String str=scanner.nextLine();
    int sum=0;
    char ch[]=str.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
    	int no=0;
    	while(i<ch.length&&ch[i]>='0'&&ch[i]<='9')
    	{
    		no=no*10+(ch[i]-48);
    		i++;
    	}
    	sum=sum+no;
    }
    System.out.println(sum);
}
}
