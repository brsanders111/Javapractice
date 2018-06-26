package com.java.add;
import java.util.Scanner;
public class Username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hey im Busby Sanders! What is your Name: ");
		String name = sc.nextLine();
		sc.close();
		
		String [] Strofarr = name.split(" ");
		
	
		String firstname = Strofarr[0]; 
		String lastname =  Strofarr[1]; 
		System.out.println("Hey nice to meet you! Mr." + lastname );
	}

}
