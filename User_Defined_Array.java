// WAP in java to take an array as input from the user. Search for a given number x and print the index at which it occurs.

import java.util.Scanner;

public class User_Defined_Array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("\nEnter elements of an array: ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nPrinting elements of an array: ");
        for(int element: arr)
        {
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.print("\nSearch an element from the given array: ");
        int search = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(search == arr[i])
            {
                System.out.println("Element is present at: "+ i);
                break;
            }
        }
    }
}
