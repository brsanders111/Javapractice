package com.java.add;
import java.util.Scanner;
public class Arrayprac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		 
		
		System.out.println("How many numbers are you inputing: eg. use 10 ");
		int y = sc.nextInt();
		int [] arr1 = new int[y];
		double sum = 0;
		double avg = 0;
		for(int i = 0; i < y; i++)
		{
			System.out.println("Enter the numbers: ");
			arr1[i] = sc.nextInt();
		}	
		
		for(int i : arr1)
		{
			sum = sum + i; 
		}
		
		avg = sum / y;
		
		System.out.println("The sum is: " + sum + "\n The average is: "
		+ avg);
		
				
		
	
		
		
		
		
	}

}
