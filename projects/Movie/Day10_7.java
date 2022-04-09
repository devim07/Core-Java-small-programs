package p1;
import java.util.Scanner;

import p1.SpeedOutOfRangeException; //optional 
import p1.SpeedUtils; // optional 

// Requirement
// one class
//check speed vehicle
// vehicle speed > 80  "SPEED IS TOO FAST"
// vehicle speed < 20  " SPEED IS TOO SLOW"


public class Day10_7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter speed");
		int s=sc.nextInt();
		SpeedUtils.validateSpeed(s);
		sc.close();
		

	}

}



/*

public class Day10_7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter speed");
			int s=sc.nextInt();
			SpeedUtils.validateSpeed(s);
		}
		catch(Exception e)
		{
			System.out.println(e.getClass().getSimpleName());
			
		}

	}

}

*/
