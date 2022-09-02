import java.util.Scanner;

class prime{
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter number \n");
        int num=obj.nextInt();
        int count=0;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime number");
        obj.close();
    }
    
}