package com.java.add;
import java.util.Scanner;
public class Gradepoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Grade for Student as a letter: ");
		char grade1 = sc.next().charAt(0);
		
		switch(grade1)
		{
			case 'A': 
				System.out.println("This person grade is between 100-90");
				break;
			case 'B':
				System.out.println("This person grade is between 89-80");
				break;
			case 'C':
				System.out.println("This person grade is between 79-70");
				break;
			case 'D':
				System.out.println("This person grade is between 69 - 60");
				break; 
			default:
			System.out.println("This person grade is between 59 - 0");
				break;
		}
	}

}

