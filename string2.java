import java.util.Scanner;

class string2{
	
	static int count(String str, String word)
	{
		String a[]=str.split(" ");
		int count =0;
		for(int i=0;i<a.length;i++)
			if(word.equals(a[i]))
				count++;
		return count;
	}
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter String");
		String str= s.nextLine();
		System.out.println("Enter word to search ");
		String word=s.nextLine();
		int res= count(str,word);
		System.out.println("No. of occurences: "+ res);
	}
}
