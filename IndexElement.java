package ArraySamp1;

import java.util.Scanner;

public class IndexElement {
	public static void main(String[] args)
	{
		int a[]= {12,55,89,60,100};
		
		int temp;
		int element;
		Scanner Se=new Scanner(System.in);
		System.out.println("Enter the element in the array :" );
		element=Se.nextInt();
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(element==a[i])
			  index=i;
		}
	  System.out.println("The index of the element is :" +index);
	
				
			
	}
		
		
	}


