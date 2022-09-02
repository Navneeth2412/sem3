import java.util.Scanner;
class Product {
    static Scanner s= new Scanner(System.in);


    static void display(int a[][],int row, int col)
    {
        for(int i=0; i<row;i++)
        {
            for(int j=0;j<col;j++)
                System.out.print(a[i][j]+" ");
            System.out.println("");
        }
    }

    static void read(int a[][],int row, int col)
    {
        for(int i=0;i<row; i++)
            for(int j=0;j<col;j++)
                a[i][j]=s.nextInt();
    }

    static void multiply(int a[][], int b[][], int row1, int col1, int row2, int col2)
    {
        if(col1==row2)
        {
            int [][] c= new int[row1][col2];
            for(int i=0;i<row1;i++)
                for(int j=0;j<col2;j++)
                    c[i][j]=0;
            System.out.println("Enter first matrix");
            read(a, row1, col1);
            display(a, row1, col1);
            System.out.println("Enter second matrix");
            read(b, row2, col2);
            display(b, row2, col2);

            for(int i=0; i<row1;i++)
                for(int j=0; j<col2;j++)
                    for(int k=0; k<row2;k++)
                        c[i][j]+=a[i][k]*b[k][j];
            System.out.println("Multiplied matrix is ");
            display(c, row1, col2);
        }
        else
            System.out.println("Matrices not multiplicable");
    }
    
    public static void main(String[] args){
        int [][] a=new int [10][10];
        int [][] b=new int [10][10];

        System.out.println("Enter no. of rows and columns of first matrix");
        int row1=s.nextInt();
        int col1=s.nextInt();
        System.out.println("Enter no. of rows and columns of second matrix");
        int row2=s.nextInt();
        int col2=s.nextInt();
        multiply(a, b, row1, col1, row2, col2);
        s.close();
    }
}