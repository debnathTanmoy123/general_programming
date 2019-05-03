import java.util.Random;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Random random = new Random();
		System.out.println("Enter how many time you want to flip the coin");
		int n = scanner.nextInt();
		int head = 0, tail = 0;
		if (n > 0) {
			for (int i = n; i > 0; i--) {
				System.out.println("press any button to flip the dice");
				scanner.next();
				double rn =  Math.random();
				if (rn > 0.5) {
					System.out.println("Tails");
					tail++;
				} 
				else {
					System.out.println("Heads");
					head++;
				}
			}
			System.out.println(head + "head");
			System.out.println(tail + "tail");
			
			
		}
		System.out.println("enter any positive value");
	}
}