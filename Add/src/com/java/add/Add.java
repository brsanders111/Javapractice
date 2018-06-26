package com.java.add;
import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int numberOne = sc.nextInt();
		System.out.println("Enter the second number: ");
		int numberTwo = sc.nextInt();
		sc.close();
		
		double sum = numberOne + numberTwo;
		System.out.println("The sum is: " + sum);
		
		double avg = sum / 2;
		System.out.println("The average is: " + avg);
		
		if(avg % 2 == 0)
		{
			System.out.println("The average is a even number");
		}
		
		else
		{
			System.out.println("The average is a odd number ");
		}
	}

}
