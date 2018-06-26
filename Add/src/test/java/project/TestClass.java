package test.java.project;
import java.util.Scanner; 
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring variables
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your grade? "); 
		int grade = in.nextInt();
		
		if(grade > 100) {
			
			System.out.println("Students can not score a grade higher than 100");
		}
		
		else if( grade <= 100 && grade >= 90) {
			
			System.out.println("A");
		}
		else if(grade < 90 && grade >= 80) {
			
			
			System.out.println("B"); 
		}
		else if(grade < 80 && grade >= 70) {
			
			System.out.println("C");
			
		}
		
		else if(grade < 70 && grade >= 65) {
			
			System.out.println("D");
		}
		else if(grade < 64 || grade == 0) {
			
			System.out.println("F");
		}
		
		else if (grade < 0) {
			System.out.println("Students can not get a negative grade");
		}
	}

}
