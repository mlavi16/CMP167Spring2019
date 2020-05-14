import java.util.Scanner;

public class Grades{
	public static void main(String [] args){
		Scanner scnr = new Scanner(System.in);
		int grade;
		int numGrades = 0;
		int numA = 0;
		int numAMinus = 0;
		int numBPlus = 0;
		int numB = 0;
		int numBMinus = 0;
		int numCPlus = 0;
		int numC = 0;
		int numCMinus = 0;
		int numD = 0;
		int numF = 0;

		System.out.println("Enter a grade: ");
		grade = scnr.nextInt();
		while (grade > -1){
			if (grade <= 100 && grade >= 93){
				numA++;
				numGrades++;
			}
			else if (grade >= 90){
				numAMinus++;
				numGrades++;
			}
			else if (grade >= 87){
				numBPlus++;
				numGrades++;
			}
			else if (grade >= 83){
				numB++;
				numGrades++;
			}
			else if (grade >= 80){
				numBMinus++;
				numGrades++;
			}
			else if (grade >= 77){
				numCPlus++;
				numGrades++;
			}
			else if (grade >= 73){
				numC++;
				numGrades++;
			}
			else if (grade >= 70){
				numCMinus++;
				numGrades++;
			}
			else if (grade >= 60){
				numD++;
				numGrades++;
			}
			else if (grade < 60){
				numF++;
				numGrades++;
			}

			System.out.println("Enter a grade: ");
			grade = scnr.nextInt();
		}

		System.out.println("Total number of grades = " + numGrades);
		System.out.println("Number of A's  = " + numA);
		System.out.println("Number of A-'s = " + numAMinus);
		System.out.println("Number of B+'s = " + numBPlus);
		System.out.println("Number of B's  = " + numB);
		System.out.println("Number of B-'s = " + numBMinus);
		System.out.println("Number of C+'s = " + numCPlus);
		System.out.println("Number of C's  = " + numC);
		System.out.println("Number of C-'s = " + numCMinus);
		System.out.println("Number of D's  = " + numD);
		System.out.println("Number of F's  = " + numF);




	}
}