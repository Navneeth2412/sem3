import java.util.Scanner;

class sort{
    
    public static void main(String[] args){
        int arr[]=new int[20];
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter number of elements ");
        int n=obj.nextInt();
        System.out.println("Enter elements ");
        for(int i=0;i<n;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array after sorting ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        obj.close();
    }
}