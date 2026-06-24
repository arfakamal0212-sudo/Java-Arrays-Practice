import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] % 2 !=0)
            {
                count++;
            }
        }
        System.out.println("Odd Count= "+ count);
    }
}