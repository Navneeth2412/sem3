import java.util.Scanner;

class string3{

	
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string ");
		String str= s.nextLine();
		System.out.println("Enter String to be replaced ");
		String old_str=s.nextLine();
		System.out.println("Enter new string ");
		String new_str=s.nextLine();
		s.close();
		String replaced= str.replace(old_str, new_str);
		System.out.println("New string is \n"+replaced);
	}
}
