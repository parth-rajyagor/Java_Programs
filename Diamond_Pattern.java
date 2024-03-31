/* WAP in java to print star diamond pattern
            *
           ***
          *****
         *******
         *******
          *****
           ***
            *

*/

import java.util.Scanner;

public class Diamond_Pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=a-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=a;i>0;i--)
        {
            for(int j=a-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=2*i-1;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
