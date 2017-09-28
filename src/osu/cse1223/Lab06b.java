/**
 * Lab06b.java
 * 
 * create a program to check for palindromes
 * 
 * @author Paul M Onderisin
 * @verison 1.0.0
 */
package osu.cse1223;

import java.util.Scanner;

public class Lab06b {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a String to check for palindrome: ");
		String s = scan.nextLine();
		
		
		while(s.length() != 0)
		{
			char[] s_toChar = s.toCharArray();
			String reversed = "";
			
			for(int i = s.length() -1;i >= 0; i--)
			{
				reversed = reversed + s_toChar[i];
			}
			
			if(s.toLowerCase().equalsIgnoreCase(reversed))
			{
				System.out.println(s + " is a palindrome.");
			}
			else
			{
				System.out.println(s + " is NOT a palindrome");
			}
			
			System.out.print("Enter a String to check for palindrome: ");
			s = scan.nextLine();
		}
		
		System.out.println("Empty line read - Goodbye!");
		
		scan.close();

	}

}
