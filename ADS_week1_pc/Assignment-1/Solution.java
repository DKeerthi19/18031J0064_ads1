import java.util.Scanner;
class LinkedList
{
	class Node
	{
		protected String digit;
		Node next;
		
		public String getDigit()
		{
			return this.digit;
		}
		public Node getNext()
		{
			return this.next;
		}
		
	}
	int elements;
	Node head,last,temp;
	LinkedList()
	{
		head=null;
		last=null;
		elements=0;
	}
	public void insert(final String val) 
	{
        if(head==null) 
        {
            head=new Node();
            head.digit=val;
            head.next=null;
            last=head;
        }
        else
        {
            temp=new Node();
            temp.digit=val;
            temp.next=null;
            last.next=temp;
            last=temp;
        }
    }		
}

class AddLargeNumbers 
{
    public static LinkedList numberToDigits(String number) 
    {
    	LinkedList ll=new LinkedList();
   	 String digits[]=number.split("");
   	 for(String each : digits)
   	 {
   		 ll.insert(each);
   	 }
        return ll;
    }
    public static String digitsToNumber(LinkedList list) 
    {
		return null;

    }
    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2)
    {
		return list2;	
    }
}
public class Solution 
{
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                LinkedList p1Digits = AddLargeNumbers.numberToDigits(p);
                LinkedList q1Digits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(p1Digits, q1Digits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }    
}
