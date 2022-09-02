import java.util.Scanner;

class Stack{
    int top;
    int arr[];
    Stack(int size)
    {
        top=-1;
        arr=new int[size];
    }
    
    void push(int num, int size)
    {
        if(top==size-1)
            System.out.println("Stack Overflow ");
        else 
            arr[++top]=num;
    }

    void pop()
    {
        if(top==-1)
            System.out.println("Underflow ");
        else
            System.out.println(arr[top--]);
    }

    void display()
    {
        int temp;
        for(temp=top;temp>=0;temp--)
            System.out.println(arr[temp]);
    }
    public static void main(String[] args){
        int ch,num;
        Scanner s= new Scanner(System.in);
        System.out.println("enter size of Stack");
        int size=s.nextInt();
        Stack stack= new Stack(size);
        do{
            System.out.println("Enter choice 1.PUSH 2.POP 3.DISPLAY 4.EXIT");
            ch=s.nextInt();
            switch(ch)
            {
                case 1: 
                    System.out.println("Enter no. to push");
                    num=s.nextInt();
                    stack.push(num,size);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting ");
                    break;
                default:
                    System.out.println("Invalid Choice. Enter again");
                    
            }
        }while(ch!=4);
        s.close();
    }
}