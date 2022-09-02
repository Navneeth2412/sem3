

class fibonacci{

    static void fib(int n)
    {
        int firstNum=1;
        int secNum=1;
        int fibN=0;
        n-=2;
        System.out.println(firstNum + "\n" + secNum);
        while(n>0)
        {
            fibN=firstNum+secNum;
            System.out.println(fibN);
            firstNum=secNum;
            secNum=fibN;
            n-=1;
        }
    }
    public static void main(String[] args){
        fib(10);
    }
}