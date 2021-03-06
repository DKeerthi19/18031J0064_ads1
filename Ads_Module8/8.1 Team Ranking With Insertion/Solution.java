import java.util.Scanner;

class Team
{
	String name;
	int wins;
	int loses;
	int draws;
	public Team(String name,int wins,int loses,int draws)
	{
		this.name=name;
		this.wins=wins;
		this.loses=loses;
		this.draws=draws;
	}
	
}
class SelectionSort 
{ 
	int count = 0;
    void Selectionsort(Team a[]) 
    { 
    	int i=0;
        while(a[i]!=null)
        {
        	if(a[i]!=null)
        		count++;
        	i++;
        }
        for (i = 0; i <count; i++) 
        { 
            
            int min = i; 
            for (int j = i+1; j < count; j++) {
                if (a[j].wins > a[min].wins) 
                    min= j; 
                if(a[j].wins == a[min].wins) {
                	if (a[j].loses < a[min].loses) 
                        min=j; 
                }
                if((a[j].wins == a[min].wins)&&(a[j].loses == a[min].loses)) {
                	if (a[j].draws > a[min].draws) 
                        min = j; 
                }
            }
            Team temp = a[min]; 
            a[min] = a[i]; 
            a[i] = temp; 
        } 
    } 
   
    void printArray(Team a[]) 
    { 
        for (int i=0; i<count; i++) 
        	if(count==1)
            {
            	System.out.println(a[0].name);
            	break;
            }
        	else if((i+1)!=count)
	        {
            	System.out.print(a[i].name+","); 
	        }
	        else
	        {
	            System.out.print(a[i].name);
	        }
              System.out.println(); 
       
    } 
} 
public class Solution {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i=0;
		Team[] t= new Team[10];
		while(sc.hasNext())
		{
		String team = sc.nextLine();
		if(team!=null)
		{
		String[] ts= team.split(",");
		String name= ts[0];
		int wins= Integer.parseInt(ts[1]);
		int loses= Integer.parseInt(ts[2]);
		int draws= Integer.parseInt(ts[3]);
		
		t[i]=new Team(name,wins,loses,draws);
		i++;
		}
		}
		SelectionSort ss =new SelectionSort();
		ss.Selectionsort(t);
		ss.printArray(t);
	}
}