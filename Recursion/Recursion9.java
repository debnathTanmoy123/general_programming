
public class Recursion9 {
	public static void main(String[] args) {
		int ar[] = { 23, 45, 56, 78, 12, 18 };
		int in = search(ar, 0, 56);
		if (in>= 0)
			System.out.println("the element is present in index=>"+in);
		else
			System.out.println("the element is not present ");
	}

	static int search(int ar[],int i,int ele) {
	if(i>=ar.length)
		return -1;

	if(ar[i]==ele)
		return i;
		
	return search(ar,i+1,ele);
		
	}
}
