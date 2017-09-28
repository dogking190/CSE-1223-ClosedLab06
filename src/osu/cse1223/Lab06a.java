/**
 * Lab06a.java
 * 
 * make a program that prints off a 10x10 times table
 * 
 * @author Paul M onderisin
 * @verison 1.0.0
 */
package osu.cse1223;

public class Lab06a {
	
	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 10)
		{
			int j = 1;
			while(j <= 10)
			{
				System.out.printf("%4d", (i*j));
				j++;
			}
			
			System.out.println("");
			i++;
		}

	}

}
