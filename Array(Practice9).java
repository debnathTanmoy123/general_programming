import java.util.Scanner;

public class Practice9 {
	
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the size of array");
			int n=scanner.nextInt();
			System.out.println("Enter the array Elements");
			int ar[]=new int[n];
			for(int i=0;i<ar.length;i++)
			{
				ar[i]=scanner.nextInt();
			}
			
			System.out.println("enter the index number");
			int in=scanner.nextInt();
			System.out.println("enter the another arrayelement value");
			int ar2[]=new int[3];
			for(int i=0;i<ar2.length;i++)
			{
				ar2[i]=scanner.nextInt();
			}
			insert(ar,in,ar2);
		}

		private static void insert(int[] ar,int in,int[] ar2) {
			
			if(in<0||in>ar.length)
			{
				System.out.println("inseertion is not possible");
			}
			int newArr[]=new int[ar.length+ar2.length];
			
			for(int i=0;i<ar.length;i++)
			{
				if(i<in)
					newArr[i]=ar[i];
				else
					newArr[i+ar2.length]=ar[i];
			}
			for(int i=0;i<ar2.length;i++)
			{
				newArr[i+in]=ar2[i];
			}
			for(int i=0;i<newArr.length;i++)
			{
				System.out.println(newArr[i]);
			}
		}

		

}
