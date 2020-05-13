//Write a Java Program to sum values of an array
package ArraySamp1;

import java.util.Scanner;

public class ArrayAddition {
         public static void main(String[] args)
        
         { 
        	 System.out.println("Enter the required size of the array :: ");
             Scanner S= new Scanner(System.in);
             int size = S.nextInt();
             int a[] = new int [size];
             int sum=0;
             System.out.println("Enter the elements of the array one by one ");
             
             for(int i=0; i<size; i++)
              {
                 a[i] = S.nextInt();
                 sum = sum + a[i];
              }
             
   
              System.out.println("Sum of the elements of the array ::"+sum);
              
         }
}
