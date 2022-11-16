import java.util.*;

class SortingInteger
{
		public static void main(String ar[])
		{
				int n,i;
				Scanner sc = new Scanner(System.in);
				System.out.println("enter n");
				n = sc.nextInt();
				
				int a[] = new int[n];
				System.out.println("enter elements");
				for(i=0;i<n;i++)
				{
						a[i] = sc.nextInt();
				}
				
				System.out.println("Display Before Sorted");
				for(int p  :  a)
				{
						System.out.print(p+"  ");
				}
				System.out.println();
				Arrays.sort(a);
				System.out.println("Display After Sorted");
				for(int p  :  a)
				{
						System.out.print(p+"  ");
				}
		}
}