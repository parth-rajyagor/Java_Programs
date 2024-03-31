/* WAP in java to print pascal's triangle
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1
*/

public class Pascals_Triangle
{
    public static void main(String[] args)
    {
        int a=5;
        for(int i=1;i<=a;i++)
        {
            for(int j=a-i;j>0;j--)
            {
                System.out.print(" ");
            }
            int b=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(b+" ");
                b = b*(i-j)/j;
            }
            System.out.println();
        }
    }
}
