public class Problem4OldSchool
    {
        public static void main(String[] args)
            {
                String[] stringarray = new String[]{"abc", "asd","12", "bac"};
                reverse(stringarray);
            }
        static void reverse (String[] arrayx)
            {
                for (int j = 0; j < arrayx.length; j++)
                    {
                        String str = arrayx[j];
                        char[] chararray = new char[str.length()];
                        for (int i = 0; i < str.length(); i++)
                            {
                                chararray[i] = str.charAt(i);//string@ chareri array
                            }
                        for (int i = 0; i < chararray.length / 2; i++)
                            {
                                char temp = chararray[i];
                                chararray[i] = chararray[chararray.length - 1 - i];
                                chararray[chararray.length - 1 - i] = temp;
                            }
                        for (int i = 0; i < chararray.length; i++)
                            {
                                System.out.print(chararray[i]);
                            }
                        System.out.println();
                    }
            }
    }
