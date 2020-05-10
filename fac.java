//Write a program to find the factorial of a number
package factorial;
import java.util.Scanner;
public class fac
{
 public static void main(String[] args)
 {
	 int num;
	 int fact=1;

	 System.out.println("Enter a number to find the factorial: ");
	 Scanner sf=new Scanner(System.in);
     num=sf.nextInt();
  
  for(int i=1;i<=num;i++)
    { 
	  fact=fact*i;
    }
  
	  System.out.println("The factorial of the number " +num+ " is "  +fact );
 }
}

  