/* WAP in java to print inverted right angle triangle/ inverted half pyramid star pattern
    *****
    ****
    ***
    **
    *
*/

import java.util.Scanner;

public class Inverted_Right_Angle_Triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=a;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
