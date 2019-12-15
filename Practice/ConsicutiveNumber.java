import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ConsicutiveNumber {
	public static void main(String[] args)
	{
		 int[] a={1,2,3,7,9,24,25,26,27,78};
highest(a);
		   
}
	static void highest(int a[])
	{
		
		int long_length=0;
		
		HashSet<Integer> hs=new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		
		for (int i = 0; i < a.length; i++) {
			if (!hs.contains(a[i]-1))
			{
			int no=a[i];	
			while(hs.contains(no))
			{
				no++;
				
			}
			
			if (long_length<no-a[i])
			{
			long_length=no-a[i];	
			
			}
			}
			
		}
		System.out.println(long_length);
		int a1[]=new int[long_length];
		for(int i=0;i<a.length;i++)
		{
			while(a[i+1]==(a[i]+1))
					{
				System.out.println(a[i]);
					}
		}
		
	}
	

}