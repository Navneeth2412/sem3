import java.util.Scanner;

class string1{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string ");
		String str= s.nextLine();
		System.out.println("Enter position ");
		int m=s.nextInt();
		System.out.println("Enter No. of characters ");
		int n=s.nextInt();
		s.close();
		char[] strArr=str.toCharArray();
	       	char[] ext=new char[n];
		for(int i=m-1,j=0;i<m+n-1;i++,j++)
			ext[j]=strArr[i];
		String extStr= new String(ext);
		System.out.println(extStr);
	}
}
