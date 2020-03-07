import java.util.Scanner;
public class Problem2
{
    public static void main(String[] args)
    {
        Scanner big=new Scanner(System.in);
        int num1=big.nextInt();
        int num2=big.nextInt();
        int result=percent(num1,num2);
        System.out.println("+" + result);
    }
     static int percent(int num1 , int num2)
    {
        int x=0;
        //num2+(num2*x)/100=num1;
         x=(num1*100-100*num2)/num2;
        return x;
    }
}
