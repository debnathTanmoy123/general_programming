package Lamda;

public class WithLamda {
public static void main(String[] args) {
	new Thread(()->
	{System.out.println("new thread created");}
			).start();
}
}
