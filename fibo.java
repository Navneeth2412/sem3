class fibo{
    public static void main(String[] args){
        int n=10, i=2;
        int fib[]=new int[20];
        fib[0]=1;
        fib[1]=1;
        System.out.println(fib[0]+"\n"+fib[1]);
        while(i<n)
        {
            fib[i]=fib[i-1]+fib[i-2];
            System.out.println(fib[i]);
            i++;
        }
    }
}