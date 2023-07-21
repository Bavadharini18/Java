import java.util.*;
public class hashstar
{
 	public static void main(String[] args)
 	{
        		
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count1=0,count2=0;
        int count=count1-count2;
        for(int i=0;i< str.length();i++)
    	{
            if(str.charAt(i)=='*')
        		count1++;
            else if(str.charAt(i)=='#')
         		count2++;
        }
        
	}
}