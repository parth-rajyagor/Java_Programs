/* WAP in java to print Palindromic number pyramid

            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
*/
package Patterns;
public class Palindromic_Number_Pyramid
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 1;
        for(int i=1;i<=a;i++)
        {
            for(int j=a-i;j>0;j--)
            {
                System.out.print("  ");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print(" "+j);
            }
            for(int k=2;k<=i;k++)
            {
                System.out.print(" "+k+"");
            }
            
            System.out.println();
        }
    }
}
