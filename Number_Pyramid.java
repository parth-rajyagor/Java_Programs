/* WAP in java to print number pyramid

        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5

*/

public class Number_Pyramid
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 1;
        for(int i=1;i<=a;i++)
        {
            for(int k=a-i;k>0;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(b+" ");
            }
            b++;
            System.out.println();
        }
    }
}
