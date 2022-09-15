import java.util.Scanner;

class Matrix {
    int mat1[][],mat2[][],res[][],m,n,p,q;
    Scanner sc=new Scanner(System.in);
    Matrix()
    {
        System.out.println("Enter order of first matrix \n");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Enter order of second matrix \n");
        p=sc.nextInt();
        q=sc.nextInt();
        if(n==p)
            System.out.println("Matrices are Multiplicable");
        else{
            System.out.println("Not multiplicable");
            System.exit(0);
        }
    }
    void input(){
        mat1=new int[m][n];
        mat2=new int[p][q];
        res=new int[m][q];
        System.out.println("Enter first Matrix: ");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                mat1[i][j]=sc.nextInt();
        System.out.println("Enter Second Matrix: ");
        for(int i=0;i<p;i++)
            for(int j=0;j<q;j++)
                 mat2[i][j]=sc.nextInt();
    }
    void display()
    {
        System.out.println("First matrix: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(mat1[i][j]+ " ");
            System.out.println();
        }
        System.out.println("Second matrix: ");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
                System.out.print(mat2[i][j]+ " ");
            System.out.println();
        }
    }
    void multi()
    {
        for(int i=0;i<m;i++)
            for(int j=0;j<q;j++)
                res[i][j]=0;
        for(int i=0;i<m;i++)
            for(int j=0;j<q;j++)
                for(int k=0;k<n;k++)
                    res[i][j]+=mat1[i][k]*mat2[k][j];
        System.out.println("Resultant matrix: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<q;j++)
                System.out.print(res[i][j]+ " ");
            System.out.println();
        }            
    }
}

class MatFinal{
    public static void main(String[] args){
        System.out.println("Hello");
        Matrix m=new Matrix();
        m.input();
        m.display();
        m.multi();
    }
}