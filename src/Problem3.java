public class Problem3
{
    public static void main(String[] args)
        {
            int[] array= new int[] {1,2,3,5,6};
            int check=4;
            int result;
            result=check(array,check);
            System.out.println(result);
        }

    static int check(int[] array, int check)
        {
            int return1=-1;
            for(int i=0;i<array.length;i++)
                {
                    if(array[i]==check)
                        {
                            return1= i;
                            break;
                        }
                }
            return return1;
        }
}
