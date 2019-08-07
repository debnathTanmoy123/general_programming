import java.util.Scanner;

public class WordsStartWithVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence..");
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			String s="";
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{ 
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
				{
				while(i<ch.length&&ch[i]!=' ')
				{
				s=s+ch[i];
				
					i++;
				}
				System.out.println(s);
				}
				
			}
			
		}
	
	
		
	}
}
