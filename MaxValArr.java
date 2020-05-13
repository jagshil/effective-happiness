//Write a program to find the maximum value in the given array.

package ArraySamp1;
import java.util.Scanner;
public class MaxValArr 
{
	public static void main(String[] args)
	{ 
		System.out.println("Enter the size of the array:" );
		Scanner S=new Scanner(System.in);
		int size=S.nextInt();
		int a[]=new int[size];
				
		//Input the elements into the array		
		System.out.println("Enter the elements of the array:");
		 
          for (int i = 0; i <size; i++)
           {                
        	 a[i] = S.nextInt();
                 
            }     
       
          //Printing the elements of the array.
		System.out.println("The elements of the array are :  ");
		int n =a.length;

        for (int i = 0; i < n; i++)
        {                
            System.out.print(a[i] + " ");              
         }     
    	
       //Printing the maximum value of the array.
        int max=a[0];
       for(int i=0;i<a.length;i++)
       {
    	   if(a[i]>max)
            max=a[i];
       }
       
       System.out.println("  the maximum value in the given array is : " +max);
	
	}
}
