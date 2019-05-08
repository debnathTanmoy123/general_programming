import java.util.Scanner;
import java.util.Stack;

public class BalanceOfString {

	static boolean isBalanced(String str) {
		if (str.length() % 2 == 1)
			return false;
		char ch[] = str.toCharArray();
		Stack<Character> stk = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == '[' || ch[i] == '{' || ch[i] == '(') {
				stk.push(ch[i]);
			} else
				{
				
				if(stk.isEmpty()) 
				return false;
				
			char pch = stk.pop();
			
			switch (ch[i]) {
			case '}':if (pch != '{') 
			
					return false;
				
				break;

			case ']':
				if (pch != '[') 
					return false;
				
				break;

			case ')':if (pch != '(') 
					return false;
				
			}
			}
		}
return stk.isEmpty();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string"); // eg- [{}]
		String st = scanner.next();

		boolean rs = isBalanced(st);
		if (rs)
			System.out.println("String is balanced");
		else
			System.out.println("String is not balanced");

	}
}
