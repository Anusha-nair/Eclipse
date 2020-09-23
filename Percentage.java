import java.util.Scanner;

/**
 * 
 */

/*
Program Name:Digitalclock.java
      Author: Anusha nair
        Date:Apr. 17, 2020 7:38:06 p.m.
 Description:
 */
public class Percentage
{
Float mark1, mark2, mark3;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name:");
		String name= sc.nextLine();
		System.out.print("Enter marks you scored Maths : ");
		float mathsMarks = sc.nextFloat();
		System.out.print("Enter total marks of Maths : ");
	  float totalMaths  = sc.nextFloat();
		System.out.print("Enter marks you scored English : ");
		float englishMarks = sc.nextFloat();
		System.out.print("Enter total marks of English : ");
		float totalEnglish  = sc.nextFloat();
		System.out.print("Enter marks you scored Social studies : ");
		float ssMarks = sc.nextFloat();
		System.out.print("Enter total marks of Social Studies : ");
		float totalSS  = sc.nextFloat();
		Float total_Outof =totalMaths+totalEnglish+totalSS;
		Float total_ScoredMarks = mathsMarks+englishMarks+ssMarks;
		Float percentage = (total_ScoredMarks * 100)/total_Outof;
		String firstFourChars = name.substring(0, 3);
		System.out.print("Hello "+firstFourChars + "Your percentage is: " + percentage);
	}

}
