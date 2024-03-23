/* WAP in java to print solid rectangle using star pattern.
    *****
    *****
    *****
    *****
*/
import java.util.Scanner;

public class Solid_Rectangle_Pattern
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for(int i=1;i<a;i++)
    {
      for(int j=1;j<a;j++)
      {
        System.out.print("*");
      }
      System.out.println("*");
    }
  }
}
