import java.util.Scanner;

class account {
    static Scanner obj = new Scanner(System.in);
    int Accno, Phone_No;
    float balance_amt;
    String name;

    void getinput() {

        System.out.println("Enter Account number ");
        this.Accno = obj.nextInt();
        System.out.println("Enter Phone number ");
        this.Phone_No = obj.nextInt();
        System.out.println("Enter Balance amount ");
        this.balance_amt = obj.nextFloat();
        System.out.println("Enter name ");
        this.name = obj.next();
    }

    void Deposit() {
        System.out.println("Enter amount to be deposited \n");
        float dep = obj.nextFloat();
        balance_amt += dep;
    }

    void Withdraw() {
        System.out.println("Enter amount to be withdrawn \n");
        float with = obj.nextFloat();
        balance_amt -= with;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + Phone_No);
        System.out.println("Amount: " + balance_amt);
        System.out.println("Account No: " + Accno);
    }

    public static void main(String[] args){
        account Acc= new account();
        int ch;
        Acc.getinput();
        do{
            System.out.println("Enter choice 1.Deposit 2.Withdraw 3.Display 4.Exit");
            ch=obj.nextInt();
            switch(ch)
            {
                case 1:
                    Acc.Deposit();
                    break;
                case 2:
                    Acc.Withdraw();
                    break;
                case 3:
                    Acc.display();
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(ch!=4);
        obj.close();
    }

}