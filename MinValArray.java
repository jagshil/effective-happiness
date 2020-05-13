package ArraySamp1;

import java.util.Scanner;

public class MinValArray 
{
	public static void main(String[] args)
	{
		
		System.out.println("Enter the size of the array");
		Scanner Sc=new Scanner(System.in);
		int size=Sc.nextInt();
		int a[]=new int[size];
		
		//Entering the elements into the array;
		System.out.println("Enter the elements of the array:");
		
		for(int i=0;i<size;i++)
		{ 
			a[i]=Sc.nextInt();
		}
		
		
		//Printing the elements of the array:
		System.out.println("The elements of the array are: ");
		
		//Minimum value of an array:
		for (int i = 0; i <size; i++)
        {                
            System.out.print(a[i] + " ");              
         }     
		
		int min=a[0];
		for(int i=0;i<size;i++)
		{
			if(a[i]<min)
			min=a[i];
		}
   System.out.println("The minimum number in the array is : " +min);
   
	}

}
