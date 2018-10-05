import java.util.*;
class Array
{
	public void array(int a[])
	{
			int n= a.length;
			int temp=0;
			for(int j=0;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[j]>a[k])
					{
						temp=a[j];
						a[j]=a[k];
						a[k]=temp;
					}		
				}
			}
			int count = 0;
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]==a[i+1])
				{
					count++;
				}
					
			}
			System.out.println("Count of pairs is:"+count);
		}
}
public class Arraysort 
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		Array a1 = new Array();
		a1.array(a);

	}

}
