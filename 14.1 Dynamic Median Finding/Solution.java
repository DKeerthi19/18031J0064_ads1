package module14;

import java.util.Scanner;
class MedianHeap
{
	public double median (int a[],int x)
	{
		double med=0;
		int len=0;
		/*while(a[len]!=0 && len<a.length-1)
		{
			
			len++;
			//System.out.println("+=="+len);
		}*/
		//System.out.println("+=="+x);
		//System.out.println();
		if(x!=0 && x%2==0) 
		{
			//System.out.println("even +"+len);
			med = (double)(a[(x/2)-1]+a[(x/2)])/2;
		}
		else
		{
			//System.out.println("odd +"+len);
			if(x!=0) {
			med = (double)a[(x/2)];}
		}
		return med;
	}
}
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1 = sc.nextLine();
		MedianHeap mh = new MedianHeap();
		int n =Integer.parseInt(n1);
		int [] in = new int[n];
		double [] out = new double[n];
		for(int i = 0 ; i<n;i++)
		{
			in[i]=Integer.parseInt(sc.nextLine());
			if(i>0) {
			out[i]=mh.median(in,i);
			System.out.println(out[i]);}
		}
		System.out.println(mh.median(in,in.length));
	}

}
