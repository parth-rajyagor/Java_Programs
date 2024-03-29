/* WAP in java to print 0-1 Triangle
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
*/

public class Zero_One_Triangle
{
    public static void main(String[] args)
    {
        int a = 5;
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if( (i+j) % 2 == 0)
                {
                    System.out.print("1"+" ");
                }
                else
                {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}
