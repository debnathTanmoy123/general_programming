import java.util.Scanner;

public class CountNumberOfWordInAString {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the sentence..");
	String st=sc.nextLine();
	count(st);
	}

	private static void count(String st) {
int count=0;
char  ch[]=st.toCharArray();
		for (int i = 0; i < st.length(); i++) {
			
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
