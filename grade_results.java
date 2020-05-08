//The Marks by a student in 5 different subjects are input from the keyboard. The student gets a division as per the following rules. :
//The student gets a division as per the following rules: Percentage above or equal to 60-- First Division, 
//Percentage above or equal to 50 and 59 -- Second Division,
//Percentage above or equal to 40 and 49 -- Third Division,
//Percentage less than 40 -- Fail .
package GradeResults;

import java.util.Scanner;

public class grade_results

{
	public static void main(String[] args)
	{
		int english;
		int mathematics;
		int science;
		int social;
		int language;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks in english: ");
		english= sc.nextInt();
		
		System.out.println("Enter marks in Mathematics : ");
		mathematics= sc.nextInt();
		
		System.out.println("Enter marks in Science :  ");
		science= sc.nextInt();
		
		System.out.println("Enter marks in social :");
		social= sc.nextInt();
		
		System.out.println("Enter marks in Language :");
		language= sc.nextInt();
	float sum;
	float percentage;
	sum= english + mathematics + science+ social + language;
	percentage=(sum*100)/500;
	System.out.println("Students percentage is : " +percentage);
	if(percentage>=60)
	 {
	  System.out.println("First Division");
	 }
	else if(percentage>=50 && percentage<=59)
	         {
		        System.out.println("Second Division");
	         }
	else if(percentage>=40&&percentage<=49)
	       {
		     System.out.println("Third Division");
		     }
	 else if(percentage<=40)
	                     {
		                 System.out.println("Fail");
	                      } 
	}
	}
	
