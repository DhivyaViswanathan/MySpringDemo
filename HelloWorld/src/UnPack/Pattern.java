package UnPack;

import java.util.*;

public class Pattern
{
    static int generate(int n)
    {
        int temp = (int) Math.pow(10, String.valueOf(n).length() - 1);

        int temp2 = n / (int) Math.pow(10, String.valueOf(n).length() - 1);

        temp = n % temp;
        temp = temp * 10;

        temp = temp + temp2;
        return temp;
    }

    public static void main(String a[])
    {
        int n;

        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        int temp = n;
        /* n-1 if you do not want to include the original digit and
        n if you want to include original digit
         */
        for (int i = 0; i < String.valueOf(temp).length() - 1; i++)
        {

            temp = generate(temp);
            System.out.println(temp);
        }

    }
}