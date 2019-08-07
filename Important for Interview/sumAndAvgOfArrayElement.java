
public class sumAndAvgOfArrayElement {
public static void main(String[] args) {
	int ar[]= {2,4,6,1,5};
	sum(ar);
	}

private static void sum(int[] ar) {
int sum=0;
for (int i = 0; i < ar.length; i++) {
	sum=sum+ar[i];
}
	System.out.println(sum);
	System.out.println("Average"+(sum/ar.length));
}
}
