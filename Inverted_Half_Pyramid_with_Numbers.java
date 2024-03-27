/* WAP in java to print inverted half pyramid with numbers

    54321
    4321
    321
    21
    1
*/

import java.util.Scanner;

public class Inverted_Half_Pyramid_with_Numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=a;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

/* WAP in java to print inverted half pyramid with numbers

    12345
    1234
    123
    12
    1
*/

/*
import java.util.Scanner;

public class Inverted_Half_Pyramid_with_Numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=a;i>=0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
*/
