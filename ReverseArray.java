import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int small=arr[0];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Reversed Array Elements: ");
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(" "+ arr[i]);
        }
    }
}