
public class CountPrimeNumberInAnArray {
	public static void main(String[] args) {
		int ar[] = { 2, 4, 6, 1, 5, 6, 3 };
		countPrime(ar);
	}

	private static void countPrime(int[] ar) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {

			if(isPrime(ar[i]))
				count++;
		}
		System.out.println(count);

	}

	private static boolean isPrime(int n) {
int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
