/* 
AUTHOR: GAURAV GARJE
PROGRAM: TO PRINT NUMBER STAIRCASE PATTERN OF N LINES LIKE:
0
1 2
3 4 5
6 7 8 9    
....
*/
import java.util.Scanner;

class NumberStaircasePattern 
{
    public static void main( String args[])
    {
        int n;  //for inputting number of lines to print
        Scanner scnr = new Scanner(System.in);  //Scanner class from java.util package for taking user inputs
        System.out.println("Enter the value of N: ");
        n = scnr.nextInt();

        int arr[][] = new int[n][]; //memory allocation of multidimensional array manually
        
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = new int[i+1];
        }
        

        int k = 0;   // for series to be assigned as value to the array
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<=i ; j++)
            {
                arr[i][j] = k;
                k++;
                System.out.print( arr[i][j] + " " ); 
            }
            System.out.println();
        }
    }
}