/* WAP in java to print solid rhombus star pattern
        *****
       *****
      *****
     *****
    *****
*/

public class Solid_Rhombus
{
    public static void main(String[] args)
    {
        int a = 5;
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
            for(int l=1;l<=a-i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
