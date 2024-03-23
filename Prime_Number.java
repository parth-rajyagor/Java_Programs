// WAP in java to check wheather the entered number is prime or not

import java.util.Scanner;

public class Prime_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt(), count = 0;
        if(a==0 || a==1)
            System.out.println("Not a prime number nor a composite number");
        else 
        {
            for(int b = 2;b<=a/2;b++)
            {
                if(a % b == 0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println("Not Prime");
            }
            else
            {
                System.out.println("Prime");
            }
        }
    }
}
