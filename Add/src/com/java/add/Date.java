package com.java.add;
import java.util.Scanner;
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("When is your Birthday in this Format: eg. dd-MM-yyyy");
		String birthday = sc.next(); 
		
		String [] arrofStr = birthday.split("-");
		String day = arrofStr[0];
		String month = arrofStr[1];
		String year = arrofStr[2];
		System.out.println("Day is " + day + "\nThe Month is " 
		+ month + "\nThe Year is " + year );
		
		
	}

}
