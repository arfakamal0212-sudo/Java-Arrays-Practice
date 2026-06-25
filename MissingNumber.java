import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        int total=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            sum=sum+arr[i];
        }
        int missing=total-sum;
        System.out.println("Missing Number: "+ missing);
    }
}