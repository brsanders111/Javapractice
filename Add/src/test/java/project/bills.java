package test.java.project;
import java.util.Scanner;
import java.util.Arrays;
public class bills {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many people are paying bills");
		int y = in.nextInt(); 
		
	
		String [][] arr1 = new String[y][4];
		for(int i = 0; i < y; i++)
		{
			System.out.println("Give me the name of people and the "
					+ "amount they pay for "
					+ "the electricy,water, and phone bills in this format: "
					+ "e.g name-electricity-water-phone ");
			String splin = in.next();
			arr1[i] = splin.split("-");
		}
		String[] max = highestamount(arr1);
		System.out.println(max[0]);
		System.out.println(max[1]);
		in.close();
	}
	
	public static String[] highestamount(String[][] arr1)
	{
		
		String [] big = new String[2];
		int numb = 0; 
		for(int i = 0; i < arr1.length; i++)
		{
			int total = 0;
			for(int k = 1; k < arr1[0].length; k++)
			{
				total+=Integer.valueOf(arr1[i][k]);
			}
			if(total > numb)
			{
				numb=total;
				big[0] = arr1[i][0];
				big[1] = String.valueOf(total);
			}
			
			
			
		}
		
		return big;
		
		
	}

}
