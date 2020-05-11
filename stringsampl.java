//1.Write a Java program to get the character at the given index within the string;

package SampleStrings;

import java.util.Scanner;

public class stringsampl
   {
	public static void main(String[] args)
	{
		
	 String str= "Java Selenium";
     System.out.println("Original String = " + str);
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the index place of the string :");
     int index=sc.nextInt();
     
     char result=str.charAt(index);
     System.out.println(result);
     
     
    /*int index1= str.charAt(0);
    int index2=str.charAt(10);
   System.out.println("The character at position 0 is " + (char)index1);
    System.out.println("The character at position 10 is " + (char)index2);*/
 
     
     }
}