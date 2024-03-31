/* WAP in java to print star hollow butterfly pattern
    *        *
    **      **
    * *    * *
    *  *  *  *
    *   **   *
    *   **   *
    *  *  *  *
    * *    * *
    **      **
    *        *
*/

import java.util.Scanner;

public class Hollow_Butterfly_Pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1; j<=i;j++)
            {
                if(i==1 || j==1 || i == j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int k=2*(a-i);k>0;k--)
            {
                System.out.print(" ");
            }
            for(int j=i; j>=1;j--)
            {
                if(j == 1 || j == i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=a;i>0;i--)
        {
            for(int j=1; j<=i;j++)
            {
                if(i==1 || j==1 || i == j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int k=2*(a-i);k>0;k--)
            {
                System.out.print(" ");
            }
            for(int j=i; j>=1;j--)
            {
                if(j==1 || i == j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
