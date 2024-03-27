/* WAP in java to print rotated right angle triangle/ rotated half pyramid star pattern
        *
       **
      ***
     ****
*/

import java.util.Scanner;

public class Rotated_Right_Angle_Triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=a-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
