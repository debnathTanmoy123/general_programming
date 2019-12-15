import java.util.Scanner;

public class Test {
	 public static void main(String args[])
     {
		 Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st=sc.next();
      boolean b=  isInteger(st);
      if (b) {
		System.out.println("Integer string");
	} else {
		System.out.println("Non Integer String");
	}
     }

	 static boolean isInteger(String st) {

		 for (int i = 0; i >st.length(); i++) {
			char ch=st.charAt(i);
			if(ch>=0&&ch<=9)
			{
				
			return true;
			
			}
			
		 }
				
		
	 return false;
		 
	}
}
