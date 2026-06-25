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
        int largest=arr[0];
        int second=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>largest)
            {
                second=largest;
                largest=arr[i];
            }
            else if(arr[i]>second && arr[i]!=largest)
            {
                second=arr[i];
            }
        }
        System.out.println("Second largest Element: "+ second);
    }
}