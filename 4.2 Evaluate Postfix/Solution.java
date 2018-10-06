import java.util.Scanner;
import java.util.Stack;
class Postfixeval 
{
	public void Postfixeval(String s) 
	    {  
			String str[] = s.split(" ");
			int n = 0, l = str.length;
			Stack<Integer> stack = new Stack<>();
			for (int i = 0; i < l; i++) 
			{
				try 
				{
					n = Integer.parseInt(str[i]);
					stack.push(n);
				} 
				catch (NumberFormatException e) 
				{
					int v1 = stack.pop();
					int v2 = stack.pop();
					switch (str[i].charAt(0)) 
					{
						case '+':
							n = v1 + v2;
							break;
						case '-':
							n = v2 - v1;
							break;
						case '*':
							n = v1 * v2;
							break;
						case '/':
							n = v2 / v1;
							break;

					}
					stack.push(n);
				}
			}
		System.out.println(stack.pop());
	}
}
public class Solution
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter String");
		String s=sc.nextLine();		
		Postfixeval p=new Postfixeval();
		p.Postfixeval(s);
	 } 

}

