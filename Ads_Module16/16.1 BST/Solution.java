import java.util.Scanner;

class Book
{
	String Name;
	String Author;
	Double Price;
	Book(String Name,String Author,Double Price)
	{
		this.Name=Name;
		this.Author=Author;
		this.Price=Price;
	}
	String getname() 
    {
        return this.Name;
    }
     String getauthor() 
    {
        return this.Author;
    }
    Double getprice()
    {
        return this.Price;
    }
     int compareTo(Book current)
    {
    	 if(this.Name.compareTo(current.Name) > 0) 
    	 {
             return 1;
         } 
    	 else if(this.Name.compareTo(current.Name)<0)
    	 {
    		 return -1;
    	 }
    	 else
    	 {
    		 return 0;
    	 }
    }
}
class BinarySearchTree 
{
    Node root=null;
    class Node 
    {
       
        Book key;
        Integer value;
         Node left;
         Node right;
        Node(Book key,Integer value)
        {
        	this.key=key;
        	this.value=value;
        }
        
    }
    public boolean isEmpty()
    { 
    return root == null; 
    }
    
    public void put(Book key, Integer value)
    { 
    root = put(root, key, value); 
    }
    private Node put(Node x, Book key, Integer val)
    {
     if (x == null) 
   	  return new Node(key, val);
     int cmp = key.compareTo(x.key);
     if (cmp < 0)
     {
    	 x.left = put(x.left, key, val);
     }
     else if (cmp > 0) 
     {
    	 x.right = put(x.right, key, val);
     }
     else
    { 
    	 x.value = val;
    	
    }
     return x;
    }
    
    public Integer get(Book key)
    { 

    return get(root, key);
    }
    
   
    private Integer get(Node x, Book key)
    {
     if(x == null) 
   	  return null;
     int cmp = key.compareTo(x.key);
     if(cmp < 0) 
   	  return get(x.left, key);
     else if(cmp > 0) 
   	  return get(x.right, key);
     else if(cmp == 0) 
   	  return x.value;
   return null;
    }
}
public class Solution {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		BinarySearchTree bt=new BinarySearchTree();
		while(sc.hasNext())
		{
			String i=sc.nextLine();
			String input[]=i.split(",");
			Book k=new Book(input[1],input[2],Double.parseDouble(input[3]));
			switch(input[0])
			{
				case "put":
				bt.put( k,Integer.parseInt(input[4]));
						break;
				case "get":
				System.out.println(bt.get(k));
						break;
			}
		}
	}

}
