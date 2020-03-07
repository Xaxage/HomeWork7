import java.util.Scanner;
public class Problem1
{
    public static void main(String[] args)
    {
    Scanner bit = new Scanner(System.in);
    int a = bit.nextInt();
    int result=number(a);
    System.out.println("The sum is = " + result);
    }
    static int number(int a)
    {
        int counter=0;
        for(int i=0;a!=0 ;i++)
        {

            counter=counter+a%10;
            a/=10;
        }
        return counter;
    }
}
