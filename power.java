//Write a program to find the power of a number.
package pwer;
import java.util.Scanner;
public class power {

	public static void main(String[] args)
	{
		int basenumber;
		int exp;
		System.out.println("Enter the base number");
		Scanner n=new Scanner(System.in);
		basenumber=n.nextInt();
		System.out.println("Enter the exp to be found ;");
		exp=n.nextInt();
		int temp=1;
		
		for(int i=1;i<=exp;i++)
		{ 
			temp=temp*basenumber;
		}
		System.out.println("result of basenumber   "   + basenumber +  "  to the power of "  + exp +  "  is  "     +temp);
	}
}
