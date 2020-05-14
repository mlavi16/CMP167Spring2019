public class DMV {
	public static void main(String[] args) {
		generateDL(19, true);
		System.out.println(calculateExpirationDate(2010));
	}
	public static void generateDL(int age, boolean testPass) {
		if (testPass && (age >= 17)) {
			System.out.println("DL genreated");
		}
		else {
			System.out.println("Cannot generate DL");
		}
	}
	public static int calculateExpirationDate(int yearGenerated) {
		return yearGenerated + 10;
	}
	
}
