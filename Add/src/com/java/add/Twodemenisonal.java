package com.java.add;
import java.util.Scanner;
public class Twodemenisonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int Sumofage = 0;
	int sumofId = 0;
	System.out.println("How many students will you be enter: ");
	int numb = sc.nextInt();
	
	int [][] student = new int [numb][2];
	for(int i = 0; i < numb; i++)
	{
		System.out.println("Student id: ");
		student[i][0] = sc.nextInt();
		System.out.println("The Student Age: ");
		student[i][1] = sc.nextInt();
		Sumofage = Sumofage + student[i][1];
		
	}
	
	double avg = average(student, Sumofage, numb);
	
	
	
	
	sc.close();	
	}
	
//	public static 


public static double average (int[][] arr, int sum, int count)
{
	double avg = sum / count; 
	System.out.println("Student Id          AgeofStudents");
	for(int i = 0; i < count; i++)
	{
		System.out.println(arr[i][0] + "                     " + arr[i][1]);
		System.out.println("----------------------------");
	}
	System.out.print("#ofStudents: " + count );
	System.out.print("   Average Age: " + avg );
	return avg;
	  
}
}
