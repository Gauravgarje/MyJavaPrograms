/* 
AUTHOR: GAURAV GARJE
PROGRAM: TO DETECT WHETHER A NUMBER IS PRIME OR NOT
LOGIC: 	Find a whole no. x > √p.
	    Take all prime no. <= x one by one. Divide p by this no. x
        If none of these divides p exactly then p is prime otherwise not
*/
import java.util.Scanner;

public class PrimeNumber 
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int p=0 ; //number to test for prime or non-prime        
        boolean isPrime = true ;
        
        do
        {
            System.out.println("Enter the no. to test for primability: ");
            p = scnr.nextInt();
        }while(p<2);

        int x = (int) Math.sqrt(p);
        for(int i=2 ; i <= x+1 ; i++)
        {
            if(p == 2)
                break;
            else if( p%i == 0 )
            {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println("The given no. is a PRIME NUMBER.");
        else
            System.out.println("The given no. is a NON-PRIME NUMBER.");
    }
}
