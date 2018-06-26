package com.java.add;
import java.util.Scanner; 
import java.util.Arrays; 
public class Palindrome2 {
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("What is the lowest number in your range: ");
		int lowestNum = sc.nextInt();
		System.out.println("What is the highest number in your range: ");
		int highestNum = sc.nextInt(); 
		sc.close();
		for(int i = lowestNum; i<= highestNum; i++) {
			isPalindrome(i);
		}
		
	}
	
	public static void isPalindrome(int numberAt)
	{
		
		int remainder = 0;
		int reverse = 0;
		int temp = numberAt;
		while(temp != 0)
		{
			remainder = temp % 10;
			temp = temp / 10;
			reverse = (reverse * 10) + remainder;
		}
		
		if(reverse == numberAt) {
			System.out.print(reverse + ", ");
		}
	}
}
