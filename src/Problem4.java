import java.util.Arrays;

public class Problem4
    {
        public static void main(String[] args)
            {
                String[] array = new String[]{"abc", "21", "asd"};
                reverse(array);
            }
        static void reverse (String[] array)
            {
                for (int i = 0; i < array.length; i++)
                    {
                        String input = array[i];

                        StringBuilder input1 = new StringBuilder();

                        // append a string into StringBuilder input1
                        input1.append(input);

                        // reverse StringBuilder input1
                        input1 = input1.reverse();

                        // print reversed String
                        System.out.println(input1);
                        // es reversi kod@ internetica .Uxaki sra cev@ durs shat ekav .  -_-
                        // 1 shabat heto noric menakov kgrem
                    }
            }
    }
