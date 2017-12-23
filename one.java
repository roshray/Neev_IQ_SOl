

import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		
		LinkedList arr =new LinkedList();


		File file = new File("test.txt");
    		Scanner sc = new Scanner(file);
 
    		while (sc.hasNextLine())
      		{
		    String input = sc.nextLine();
 		}

		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==','){
				int n = Integer.parseInt(input.substring(i-2,i));
				arr.add(n);
			}
		}

		for(int i=0;i<arr.size();i++)
		    System.out.print(arr.get(i)+" ");
		    
		LinkedList sarr = new LinkedList(arr);
		Collections.sort(sarr);
		int  p;
		double sum=0;

		
		for(int i=0; i<sarr.size();i++)
		{

		   p = arr.indexOf(sarr.get(i));

		   if(p==0 && p==arr.size()-1)
		   {
		   	continue;
		   }
		   else if(p==0)
		   {
		       continue;
		       
		   }
		   else if(p==arr.size()-1)
		   {
		   	continue;
		   }
		   
		   else
		   {

		      sum = sum + ((int)(arr.get(p-1)) * (int)(arr.get(p)) * (int)(arr.get(p+1)));
		      arr.remove(p);
		      for(int j=0;j<arr.size();j++)
			System.out.print(arr.get(j)+" ");
		   }
		}
		
		for(int j=0;j<arr.size();j++)
			System.out.print(arr.get(j)+" ");
		
		int max = ((int)arr.get(0) > (int)arr.get(arr.size()-1)) ? (int)arr.get(0):  (int)arr.get(arr.size()-1) ;
		int min = ((int)arr.get(0) < (int)arr.get(arr.size()-1)) ? (int)arr.get(0):  (int)arr.get(arr.size()-1) ;
		
		sum = sum + min*max + max;
			
		System.out.println("Sum=" + sum);
		
	}
}