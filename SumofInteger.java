import java.util.Scanner;
public class SumofInteger
{
    public static void main(String args[])
    {
        int sum=0;
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter five integers one by one: ");
        for(int i=0;i<5;i++)
        {
            num=sc.nextInt();
            sum+=num;
        }
        System.out.println("Sum of given five integers : "+sum);
    }
}