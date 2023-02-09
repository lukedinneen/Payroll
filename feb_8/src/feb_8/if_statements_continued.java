package feb_8;

import java.util.Scanner;


public class if_statements_continued {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double HAvg, Test1, Test2, Test3, Test4;
		
		
		
	// Get Test Scores
	
		System.out.print("Enter homework average ");
		HAvg = scan.nextDouble();
		
		System.out.print("Enter score for test 1 ");
		Test1 = scan.nextDouble();
		
		System.out.print("Enter score for test 2 ");
		Test2 = scan.nextDouble();
		
		System.out.print("Enter score for test 3 ");
		Test3 = scan.nextDouble();
		
		System.out.print("Enter score for test 4 ");
		Test4 = scan.nextDouble();
		
	// Calculate the average
		
		double TAvg = ( Test1 + Test2 + Test3 + Test4 ) / 4;
		double CAvg = HAvg * 0.5 + TAvg * 0.5;
	
	// Give letter grade
		
		char Grade; 
		
		if (CAvg >= 90)	
			Grade = 'A';
		
		else if (CAvg >= 80)
			Grade = 'B';
		
		else if (CAvg >= 70)
			Grade = 'C';
		
		else if (CAvg >= 60)
			Grade = 'D';
		
		else
			Grade = 'F';
		
		System.out.println("Your average is " + CAvg + " Your grade is " + Grade);
		
		
		
		
			
		
		
	}

}
