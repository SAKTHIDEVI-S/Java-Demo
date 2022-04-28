package main.prblm;

import java.util.Scanner;

public class Reverse {
	public static int reverse(int num)
	{
		int reverse = 0;
		int lastDigit;
		while(num>0)
		{
			lastDigit = num%10;
			//To handle trailing zeroes
			if(lastDigit==0)
			{
				String rem1=String.valueOf(lastDigit);
				System.out.print(rem1);
			}
			reverse = (reverse*10)+lastDigit; 
			num = num/10; 
		}
		return reverse;
	}

	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(+ reverse(num));
	}


}