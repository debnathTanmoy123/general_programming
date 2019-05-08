package Implementing_own_stack;

public class MainStack {
public static void main(String[] args) {
	MyStack sk=new MyStack(8);
	sk.push("suresh");
	sk.push("mahesh");
	sk.push("ramesh");
	sk.push("nagesh");
	sk.push("rajesh");
	System.out.println(sk);
	sk.pop();
	System.out.println(sk);
	sk.pop();
	System.out.println(sk);
	System.out.println(sk.size());
	System.out.println(sk.peek());
	System.out.println(sk.isEmpty());
}
}
