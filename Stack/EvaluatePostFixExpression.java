import java.util.Scanner;
import java.util.Stack;

public class EvaluatePostFixExpression {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the post fix expression...");
	String st=scanner.next();//ab+c*
	Stack<Double> stk=new Stack<Double>();
	for(int i=0;i<st.length();i++)
	{
		char ch=st.charAt(i);
		if(ch>65&&ch<=90||ch>=97&&ch<=122)
		{
			System.out.println("Enter the value of=>"+ch);
			double v=scanner.nextDouble();
			stk.push(v);
			System.out.println(v);
		}
		else
		{
			double x=stk.pop();
			double y=stk.pop();
			switch (ch) {
			case '+':stk.push(y+x);
				
				break;
				
				
				case '-':stk.push(y-x);
					
					break;
					
					
					case '*':stk.push(y*x);
						
						break;
						
						
						case '/':stk.push(y/x);
							
							break;
							
							case '%':stk.push(y%x);
								
								break;

			}
		}
	}
					System.out.println("Evaluated value is:"+stk.pop());
				}
			}
	

