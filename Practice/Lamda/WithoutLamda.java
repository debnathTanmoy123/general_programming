package Lamda;

public class WithoutLamda {
public static void main(String[] args) {
	//// create anonymous inner class object 
	new Thread(new Runnable() {
		
		@Override
		public void run() {

			System.out.println("new thread created");
		}
	}).start();
}
}
