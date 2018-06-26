package com.java.add;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want in your Fibnacci Series: ");
		int input = sc.nextInt();
		
		fibonacciSeries(input);
		
		
		}
	
	public static int fibonacciSeries(int count)
	{
		
		int a = 0; int b = 1; int c = 0;
		
		if (count == 0 )
		{
			System.out.println(0);
		}
		
		System.out.print(a + ", " + b + ", ");
		
		for(int i = 0; i < count; i ++)
		{
			c = a + b;
			a = b;
			b = c;
			if (i != count -1) {
				System.out.print(b + ", ");
			}
			else {
				System.out.print(b);
			}
				
		}
		
		return b;
	}

}
