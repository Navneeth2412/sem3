import java.util.Scanner;
import java.util.Arrays;

class string4{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter String ");
		String str=s.nextLine();
		char [] charArray= str.toCharArray();
		Arrays.sort(charArray);
		System.out.println("Sorted String is\n "+ new String(charArray));		
	}
}
