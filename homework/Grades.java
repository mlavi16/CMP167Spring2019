import java.util.Scanner;

public class Grades{
	public static void main(String [] args){
		Scanner scnr = new Scanner(System.in);
		int numLines = readAndPrint(scnr);
		while (numLines > 0){
			numLines = readAndPrint(scnr);
		}
	}
	public static int readAndPrint(Scanner scnr){
		int[] grades = new int[50];
		int numGrades = readGrades(grades, scnr);
		int maxGrade = maxValue(grades, 0, numGrades-1);
		int minGrade = minValue(grades, 0, numGrades-1);
		if (numGrades != 0){
			System.out.println("Number Of Grades = " + numGrades);
			System.out.println("Maximum Grade = " + maxGrade);
			System.out.println("Minimum Grade = " + minGrade);
			System.out.println();
		}	
		return numGrades;
	}
	public static int readGrades(int[] grades, Scanner scnr){
		int numGrades = 0;
		int currGrade;

		System.out.println("Enter a grade : ");
		currGrade = scnr.nextInt();

		while (currGrade >= 0){
			grades[numGrades] = currGrade;
			numGrades++;
			System.out.println("Enter a grade : ");
			currGrade = scnr.nextInt();
		}
		return numGrades;
	}
	public static int sum(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}
	public static int sum(int[] arr, int firstIndex, int lastIndex){
		int sum = 0;
		if ((firstIndex < 0) || (firstIndex > (arr.length - 1)) || (firstIndex > lastIndex) || (lastIndex < 0) || (lastIndex > (arr.length - 1))){
			return -666;
		}
		for (int i = firstIndex; i <= lastIndex; i++){
			sum += arr[i];
		}
		return sum;
	}
	public static double average(int[] arr){
		final int NUM_VALS = arr.length;
		double avg = 0.0;
		for (int i = 0; i < NUM_VALS; i++){
			avg += arr[i];
		}
		avg /= NUM_VALS;
		return avg;
	}
	public static int maxValue(int[] arr){
		int maxValue = arr[0];
		for (int i = 0; i <  arr.length; i++){
			if (arr[i] > maxValue){
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
	public static int maxValue(int[] arr, int firstIndex, int lastIndex){
		if ((firstIndex < 0) || (firstIndex > (arr.length - 1)) || (firstIndex > lastIndex) || (lastIndex < 0) || (lastIndex > (arr.length - 1))){
			return -666;
		}
		int maxValue = arr[firstIndex];
		for (int i = firstIndex; i <= lastIndex; i++){
			if (arr[i] > maxValue){
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
	public static int indexOfFirstMaxValue(int[] arr){
		int maxValue = arr[0];
		int indexOfFirstMaxValue = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] > maxValue){
				indexOfFirstMaxValue = i;
				maxValue = arr[i];
			}
		}
		return indexOfFirstMaxValue;
	}
	public static int minValue(int[] arr){
		int minValue = arr[0];
		for (int i = 0; i <  arr.length; i++){
			if (arr[i] < minValue){
				minValue = arr[i];
			}
		}
		return minValue;
	}
	public static int minValue(int[] arr, int firstIndex, int lastIndex){
		if ((firstIndex < 0) || (firstIndex > (arr.length - 1)) || (firstIndex > lastIndex) || (lastIndex < 0) || (lastIndex > (arr.length - 1))){
			return -666;
		}
		int minValue = arr[firstIndex];
		for (int i = firstIndex; i <= lastIndex; i++){
			if (arr[i] < minValue){
				minValue = arr[i];
			}
		}
		return minValue;
	}
	public static int indexOfFirstMinValue(int[] arr){
		int minValue = arr[0];
		int indexOfFirstMinValue = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] < minValue){
				indexOfFirstMinValue = i;
				minValue = arr[i];
			}
		}
		return indexOfFirstMinValue;
	}
	public static int numberOfBelowAverageElements(int[] arr){
		final int NUM_VALS = arr.length;
		double avg = 0.0;
		int numberOfBelowAverageElements = 0;
		for (int i = 0; i < NUM_VALS; i++){
			avg += arr[i];
		}
		avg /= NUM_VALS;
		for (int i = 0; i < NUM_VALS; i++){
			if (arr[i] < avg){
				numberOfBelowAverageElements++;
			}
		}
		return numberOfBelowAverageElements;
	}
	public static int numberOfAboveAverageElements(int[] arr){
		final int NUM_VALS = arr.length;
		double avg = 0.0;
		int numberOfAboveAverageElements = 0;
		for (int i = 0; i < NUM_VALS; i++){
			avg += arr[i];
		}
		avg /= NUM_VALS;
		for (int i = 0; i < NUM_VALS; i++){
			if (arr[i] > avg){
				numberOfAboveAverageElements++;
			}
		}
		return numberOfAboveAverageElements;
	}
	public static void rotateElements(int[] arr){
		int tempVal = arr[arr.length - 1];
		for (int i = (arr.length - 1); i > 0; i--){
			arr[i] = arr[i-1];
		}
		arr[0] = tempVal;
	}
	public static void rotateElements(int[] arr, int rotationCount){
		for (int i = 0; i < rotationCount; i++){
			rotateElements(arr);
		}
	}
	public static void reverseArray(int[] arr){
		final int NUM_VALS = arr.length;
		int tempVal;
		for (int i = 0; i < (NUM_VALS/2); i++){
			tempVal = arr[i];
			arr[i] = arr[(NUM_VALS - 1) - i];
			arr[(NUM_VALS - 1) - i] = tempVal;
		}
	}


















}