package com.java.add;
import java.util.Scanner;
public class StringValidation {

	public static void main(String[] args)
    {
		 Scanner sc = new Scanner(System.in);
	        boolean validation = false; 
	        
	         System.out.println("When creating a password"
	               + " please Start with A-F, no more than 7 characters"
	               + ", need a special character ex: & or $, can include digits,"
	               + "end with #  ");
	        //while password is false the user need to keep inputing a password
	        while( validation == false)
	        {
	           System.out.println("Enter a password: ");
	            String password = sc.next(); 
	            validation = validPass(password);
	         if(validation == false)
	             System.out.println("This password isn't valid try again.");
	        }
	        System.out.println("This is a valid password.");

}
	
	
	
	public static boolean validPass(String pw)
    {
        boolean validation = false; 
        
        if(pw.charAt(0) >= 'A' && pw.charAt(0)<= 'F')
        {
            if(pw.length() >=  7)
            {
              if(pw.contains("&") || pw.contains("$"))
              {
                if(pw.charAt(pw.length()-1) == '#')
                {
                   validation = true;
                }
                  
              }
              
            }
        }
        	return validation;
        }
}