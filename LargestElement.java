import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int large=arr[0];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            if(arr[i] > large)
            {
                large = arr[i];
            }
        }
        System.out.println("Largest Element: "+ large);
    }
}