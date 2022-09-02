import java.util.Scanner;

class string5{
	public static void main(String[] args){
	Scanner s= new Scanner(System.in);
	System.out.println("Enter first string ");
	String fstr=s.next();
	System.out.println("Enter Second string ");
	String sstr=s.next();
	if(fstr.equals(sstr))
		System.out.println("Both strings are same ");
	else 
		System.out.println("Both strings are not same");
	s.close();
	}
}
