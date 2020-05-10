//Enter the current year and the year in which the employee joined are entered throught the keyboard.
//If the number of years for which the employee has served the organization is greater than 3 years then a bonus of
// rs2500 is given to the employee. If the years of service is not greater than 3 then program should do nothing.
package EmpBonus;

import java.util.Scanner;

public class employee_bonus
{
  public static void main (String[] args)
  { 
	  int current_year;
	  int date_of_joining;
	  int service;
	  
	  int bonus=2500;
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter the current year of the employee in the organisation: ");
	  current_year=sc.nextInt();
	  
	  System.out.println("Enter the date of joining of the employee in the organization: ");
	  date_of_joining= sc.nextInt();
	  
	  service=(current_year)-(date_of_joining);
	  System.out.println("the number of years the employee in service is : " +service);
	  
	 if(service>=3)
		 System.out.println("The bonus of the employee is : "+bonus);
	 else
		 System.out.println("There is no bonus for the employee:");
  }
}
