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
			int temp1 = a[0];
			for(int i=1;i<n;i++)
			{
				if(a[i]==temp1)
				{
					count++;
				}
				temp1=a[i];
				
			}
			System.out.println("No.of equal numbers in array: "+count);
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
