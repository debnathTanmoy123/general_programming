import java.util.Scanner;

public class ReverseTheWordsOfASentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence..");
		String st = sc.nextLine();
		reverse(st);

	}

	private static void reverse(String st) {
char ch[]=st.toCharArray();
String st1="";
for(int i=ch.length-1;i>=0;i--)
{
	int k=i;
	
	while(i>=0&&i!=' ')
	{
i--;		
	}
	int j=i+1;
	
	while(j<=k)
	{
		st1=st1+ch[j];
		j--;
	}
	while(i>0)
	{
		st1=st1+ch[i];
	}
}




		System.out.println(st);
	}

}
