import java.util.Scanner;

public class MainQue {
public static void main(String[] args) {
	MyQue mq=new MyQue(3);
	mq.enQue("A");
	mq.enQue("B");
	mq.enQue("C");
	System.out.println(mq);
	System.out.println(mq.size());
	
	System.out.println(mq.deQue());
	
}
}
