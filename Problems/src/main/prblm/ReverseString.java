package main.prblm;

import java.util.Scanner;

public class ReverseString {
	public static String reverse(String str)
	{
		//reversed string is empty initially
		String reversedStr="";
		char eachChar;
		//looping through each character and adding it to reversed string
		for (int i=0; i<str.length(); i++)
	      {
	        eachChar= str.charAt(i); //extracts each character
	        reversedStr= eachChar+reversedStr; //adds each character in front of the existing string
	      }
		return reversedStr;
	}
	public static void main (String[] args) {
		System.out.println("Enter a string: ");
		//input string
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();   
		sc.close();
		//calling reverse method
		System.out.println(reverse(str));
    }
}
