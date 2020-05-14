public class Animal{
	private String name;
	private int birthYear;
	private double weight;
	private char gender;

	public static void main(String[] args){
		Animal lion = new Animal("lion", 1999, 12, 'f');
		lion.printDetails();

	}

	public Animal(){
		name = "";
		birthYear = 1900;
		weight = 0.0;
		gender = 'u';
	}
	public Animal(String name, int birthYear, double weight, char gender){
		this.name = name;
		this.birthYear = birthYear;
		this.weight = weight < 0 ? -1 : weight;
		this.gender = gender != 'm' && gender != 'f' ? 'u': gender;

	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getBirthYear(){
		return birthYear;
	}
	public void setBirthYear(int birthYear){
		this.birthYear = birthYear;
	}
	public double getWeight(){
		return weight;
	}
	public void setWeight(double weight){
		this.weight = weight < 0 ? -1 : weight;
	}
	public char getGender(){
		return gender;
	}
	public void setGender(char gender){
		this.gender = gender != 'm' && gender != 'f' ? 'u': gender;

	}
	public int calculateAge(int currentYear){
		return birthYear > currentYear ? -1 : (currentYear - birthYear);
	}
	public boolean isMale(){
		return (gender == 'm');
	}
	public boolean isFemale(){
		return (gender == 'f');
	}
	public void printDetails(){
		System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n", name, birthYear, weight, gender);
	}
	public void gainWeight(){
		weight += 1;
	}
	public void gainWeight(double weight){
		this.weight += weight;
		if (this.weight < 0){
			this.weight = 0;
		}
	}
	public void loseWeight(){
		weight -= 1;
		if (this.weight < 0){
			this.weight = 0;
		}

	}
	public void loseWeight(double weight){
		this.weight -= weight;
		if (this.weight < 0){
			this.weight = 0;
		}

	}





}

