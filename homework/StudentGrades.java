public class StudentGrades {
	public static void main(String[] args) {
		int[] studentIDs = {5534, 2238, 6598, 7922, 4973};
		int[] numGrades = {4, 2, 3, 1, 2};
		int[] grades = {87, 92, 33, 65, 79, 92, 88, 95, 75, 99, 68, 72};
		int j = 0;
		for (int i = 0; i < studentIDs.length; i++){
			System.out.print("Student ID = " + studentIDs[i] + " Count = " + numGrades[i] + " Grades = ");
			for (int k = 0; k < numGrades[i]; k++){
				System.out.print(grades[j] + " ");
				j++;
			}
			System.out.println();

			//Student ID = 5534 Count = 4 Grades = 87 92 33 65

		}
	}
}