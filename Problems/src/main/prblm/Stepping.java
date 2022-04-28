//Program To Print Stepping Numbers :
package main.prblm;

import java.util.Scanner;
import java.util.*;
public class Stepping {
    public static boolean isStepNum(int i) 
    {
        // Initialize prevDigit with -1
        int prevDigit = -1;
        int lastDigit = i%10; //last digit
        int originalNum = i;
        // Iterate through all digits of n and compare diff bet value of prev and cur digits
        while (i > 0)
        {
        
            // Get Current digit
            int curDigit = i % 10; //curDigit = 0 //curDigit = 1
            
            // Single digit is consider as a Stepping Number
            if (prevDigit != -1) //skips // condition true
            {
                // Check if absolute difference between
                // prev digit and current digit is 1
                if (Math.abs(curDigit-prevDigit) != 1) // 1 - 0 = 1 //true
                    return false;
            }
            i /= 10; 
            prevDigit = curDigit; //prevDigit = 0
        }
        if(originalNum>=0&&originalNum<=9)
        {
        	return true;
        }
        else
        {
        if (Math.abs(lastDigit-prevDigit) == 1) //lastdigit and firstdigit diff
        	return true;
        else
        	return false;
        }
    }
 
    public static void displaySteppingNumbers(int m,int n)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Iterate through all the numbers in given range and print if it is a stepping number.
        for (int i = m; i <= n; i++)
        {	if (isStepNum(i))
        	{
        		list.add(i);
        		System.out.print(i+ " ");
        	}
        
        }
        if(list.isEmpty())
        {
        	System.out.println("No stepping Number");
        }

    }
 
    public static void main(String args[])
    {
    	int m,n;
    	Scanner sc = new Scanner(System.in);
    	m = sc.nextInt();
    	n = sc.nextInt();
    	sc.close();
        // Display Stepping Numbers in the range [m,n]
        displaySteppingNumbers(m,n);
    }
}
