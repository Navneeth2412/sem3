import java.util.Scanner;

class string6{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter two strings ");
		String str1=s.nextLine();
		String str2=s.nextLine();
		String str3=str1.concat(str2);
		System.out.println("Concatenated string is "+str3);
		s.close();
	}
}

