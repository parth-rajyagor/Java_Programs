/* WAP in java to print a star hollow rhombus
        *****
       *   *
      *   *
     *   *
    *****
*/

import java.util.Scanner;

public class Hollow_Rhombus
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=a-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=a;k++)
            {
                if(i==1 || k==1 || i==a || k==a)
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
