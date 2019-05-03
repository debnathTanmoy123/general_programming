import java.util.Scanner;

public class Problem1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
	String st=sc.nextLine();
	if(st.length()>=3)
		System.out.println("Hello"+st+", How are you?");
	else
		System.out.println("Give a proper input where userName has minimum 3 character");
}
}
