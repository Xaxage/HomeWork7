import java.util.Scanner;
public class Problem5
{
    public static void main(String[] args)
    {
        Scanner set=new Scanner(System.in);
        System.out.println("Enter non-negative number ");
        int num=set.nextInt();
        boolean result;
        check(num);
    }
    static void check(int a)
    {
        boolean x=false;
        for(int i=0;a!=0;i++)
        {
            if(a%10==0)
            {
                x=true;
                break;
            }
            a/=10;
        }
        System.out.println(x);
    }
}
