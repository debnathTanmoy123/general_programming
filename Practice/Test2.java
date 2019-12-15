import java.util.Scanner;

public class Test2 {
	 public static void main(String args[])
     {
		 Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st=sc.nextLine();
     toUppar(st);
     }

	private static void toUppar(String st) {

		char[] c=st.toCharArray();
		for (int i = 0; i<c.length; i++) {
		if(i==0&&c[i]!=' '||c[i]!=' '&&c[i-1]==' ')
		{
			if(c[i]>='a'&&c[i]<='z')
				c[i]=(char) (c[i]-32);
		}
		else if(c[i]>='A'&&c[i]<='Z')
			c[i]=(char) (c[i]+32);	
		
		}
		String s1=new String(c);
		
		System.out.println(s1);
	}

}
