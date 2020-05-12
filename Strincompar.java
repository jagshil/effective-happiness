//Write a program to compare two strings;

package SampleStrings;
public class Strincompar {
	public static void main(String[] args)
	{
		String Str1= "Mickey Mouse";
		String Str2= "Mickey Mouse";
		System.out.println("The first string is : "  +Str1);
		System.out.println("The second string is : " +Str2);
		int result=Str1.compareTo( Str2 );
		System.out.println(result);
	}

}
